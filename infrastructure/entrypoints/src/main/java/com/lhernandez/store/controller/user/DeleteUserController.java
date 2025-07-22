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
public class DeleteUserController {
    private final UserHandler handler;

    public DeleteUserController(UserHandler handler) {
        this.handler = handler;
    }

    @PostMapping("/delete")
    public ResponseEntity<UserDto> delete(@RequestBody UserDto userDto) {
        handler.delete(userDto);
        return new ResponseEntity<>(userDto, HttpStatus.OK);
    }
}
