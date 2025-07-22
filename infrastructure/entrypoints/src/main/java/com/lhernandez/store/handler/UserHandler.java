package com.lhernandez.store.handler;

import com.lhernandez.store.dto.UserDto;
import com.lhernandez.store.mapper.UserDtoMapper;
import com.lhernandez.store.user.*;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class UserHandler {

    private final UserDtoMapper mapper;
    private final CreateUser create;
    private final DeleteUser delete;
    private final GetAllUsers  getAll;
    private final GetUser get;
    private final UpdateUser update;

    public UserHandler(UserDtoMapper userDtoMapper, CreateUser createUser, DeleteUser deleteUser, GetAllUsers getAll, GetUser get, UpdateUser update) {
        this.mapper = userDtoMapper;
        this.create = createUser;
        this.delete = deleteUser;
        this.getAll = getAll;
        this.get = get;
        this.update = update;
    }

    public Optional<UserDto> create(UserDto userDto) {
        return this.create.createUser(mapper.toEntity(userDto)).map(mapper::toDto);
    }

    public void delete(UserDto userDto) {
        this.delete.deleteUser(mapper.toEntity(userDto));
    }

    public List<UserDto> getAll(){
        return this.getAll.getAllUsers().stream().map(mapper::toDto).collect(Collectors.toList());
    }

    public Optional<UserDto> get(Integer id) {
        return this.get.getUser(id).map(mapper::toDto);
    }

    public UserDto update(UserDto userDto) {
        return mapper.toDto(this.update.update(mapper.toEntity(userDto)));
    }

}
