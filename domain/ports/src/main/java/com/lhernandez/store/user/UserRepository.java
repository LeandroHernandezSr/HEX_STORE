package com.lhernandez.store.user;

import com.lhernandez.store.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository {
    Optional<User>createUser(User user);
    void deleteUser(User user);
    List<User> getAllUsers();
    Optional<User>getUser(Integer id);
    User updateUser(User user);
}
