package com.lhernandez.store.controller.user;

import com.lhernandez.store.dto.UserDto;
import com.lhernandez.store.handler.UserHandler;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class CreateUserController {

    private final UserHandler handler;

    public CreateUserController(UserHandler handler) {
        this.handler = handler;
    }

    @PostMapping("/create")
    public ResponseEntity<UserDto> create(@RequestBody UserDto userDto){
        return new ResponseEntity<>(handler.create(userDto).get(), HttpStatus.CREATED);
    }
}
