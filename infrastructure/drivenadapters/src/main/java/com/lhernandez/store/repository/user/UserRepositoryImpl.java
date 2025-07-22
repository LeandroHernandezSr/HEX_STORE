package com.lhernandez.store.repository.user;

import com.lhernandez.store.User;
import com.lhernandez.store.mappers.UserMapper;
import com.lhernandez.store.user.UserRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class UserRepositoryImpl implements UserRepository {

    private final UserJpaRepository repository;
    private final UserMapper mapper;

    public UserRepositoryImpl(UserJpaRepository repository, UserMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public Optional<User> createUser(User user) {
        return Optional.of(mapper.entityToUser(repository.save(mapper.userToEntity(user))));
    }

    @Override
    public void deleteUser(User user) {
        repository.delete(mapper.userToEntity(user));
    }

    @Override
    public List<User> getAllUsers() {
        return repository.findAll().stream()
                .map(mapper::entityToUser)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<User> getUser(Integer id) {
        return repository.findById(id).map(mapper::entityToUser);
    }

    @Override
    public User updateUser(User user) {
        return mapper.entityToUser(mapper.userToEntity(user));
    }
}
