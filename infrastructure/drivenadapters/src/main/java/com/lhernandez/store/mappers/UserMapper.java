package com.lhernandez.store.mappers;

import com.lhernandez.store.User;
import com.lhernandez.store.entities.UserEntity;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public User entityToUser(UserEntity userEntity){
        return new User(userEntity.getId(),
                userEntity.getName(),
                userEntity.getEmail(),
                userEntity.getPassword());
    }

    public UserEntity userToEntity(User user){
        return new UserEntity(user.getId(),
                user.getName(),
                user.getEmail(),
                user.getPassword());
    }
}
