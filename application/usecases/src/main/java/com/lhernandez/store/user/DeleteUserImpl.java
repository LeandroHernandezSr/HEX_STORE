package com.lhernandez.store.user;

import com.lhernandez.store.User;
import org.springframework.stereotype.Component;

@Component
public class DeleteUserImpl implements DeleteUser {

    private UserRepository repository;

    @Override
    public void deleteUser(User user) {
        this.repository.deleteUser(user);
    }
}
