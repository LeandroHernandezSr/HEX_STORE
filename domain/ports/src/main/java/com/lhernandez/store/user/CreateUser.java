package com.lhernandez.store.user;

import com.lhernandez.store.User;

import java.util.Optional;

public interface CreateUser {
    Optional<User> createUser(User user);
}
