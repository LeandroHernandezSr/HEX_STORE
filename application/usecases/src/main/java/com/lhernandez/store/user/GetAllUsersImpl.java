package com.lhernandez.store.user;

import com.lhernandez.store.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GetAllUsersImpl implements GetAllUsers {

    private final UserRepository repository;

    public GetAllUsersImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<User> getAllUsers() {
        return this.repository.getAllUsers();
    }
}
