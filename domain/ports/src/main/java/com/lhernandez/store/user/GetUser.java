package com.lhernandez.store.user;

import com.lhernandez.store.User;

import java.util.Optional;

public interface GetUser {
    Optional<User> getUser(Integer id);
}
