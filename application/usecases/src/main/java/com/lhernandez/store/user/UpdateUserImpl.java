package com.lhernandez.store.user;

import com.lhernandez.store.User;
import org.springframework.stereotype.Component;

@Component
public class UpdateUserImpl implements UpdateUser{

    private final UserRepository repository;

    public UpdateUserImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public User update(User user) {
        return this.repository.updateUser(user);
    }
}
