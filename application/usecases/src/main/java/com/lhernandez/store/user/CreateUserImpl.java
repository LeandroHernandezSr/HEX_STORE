package com.lhernandez.store.user;

import com.lhernandez.store.User;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class CreateUserImpl implements CreateUser {

    private final UserRepository repository;

    public CreateUserImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public Optional<User> createUser(User user) {
        return repository.createUser(user);
    }
}
