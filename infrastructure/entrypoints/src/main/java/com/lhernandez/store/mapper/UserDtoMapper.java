package com.lhernandez.store.mapper;

import com.lhernandez.store.User;
import com.lhernandez.store.dto.UserDto;
import org.springframework.stereotype.Component;

@Component
public class UserDtoMapper {

    public User toEntity(UserDto userDto) {
        return  new User(
                userDto.getId(),
                userDto.getName(),
                userDto.getEmail(),
                userDto.getPassword());
    }

    public UserDto toDto(User user) {
        return new UserDto(
              user.getId(),
              user.getName(),
              user.getEmail(),
              user.getPassword()
        );
    }

}
