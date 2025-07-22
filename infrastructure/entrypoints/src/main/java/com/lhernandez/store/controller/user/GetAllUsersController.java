package com.lhernandez.store.controller.user;

import com.lhernandez.store.dto.UserDto;
import com.lhernandez.store.handler.UserHandler;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/user")
@Controller
public class GetAllUsersController {
    private final UserHandler handler;

    public GetAllUsersController(UserHandler handler) {
        this.handler = handler;
    }

    @PostMapping("/get-all")
    public ResponseEntity<List<UserDto>> getAllUsers(){
        return new ResponseEntity<>(handler.getAll(), HttpStatus.OK);
    }
}
