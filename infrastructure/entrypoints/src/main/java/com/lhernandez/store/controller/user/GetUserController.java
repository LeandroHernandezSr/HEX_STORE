package com.lhernandez.store.controller.user;

import com.lhernandez.store.dto.UserDto;
import com.lhernandez.store.handler.UserHandler;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class GetUserController {

    private final UserHandler handler;

    public GetUserController(UserHandler handler) {
        this.handler = handler;
    }

    @PostMapping("/get/{id}")
    public ResponseEntity<UserDto> get(@PathVariable Integer id){
        return new ResponseEntity<>(this.handler.get(id).get(), HttpStatus.OK);
    }
}
