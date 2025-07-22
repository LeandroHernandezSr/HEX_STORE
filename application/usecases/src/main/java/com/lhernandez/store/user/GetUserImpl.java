package com.lhernandez.store.user;

import com.lhernandez.store.User;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class GetUserImpl implements GetUser{

    private final UserRepository repository;

    public GetUserImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public Optional<User> getUser(Integer id) {
        return this.repository.getUser(id);
    }
}
