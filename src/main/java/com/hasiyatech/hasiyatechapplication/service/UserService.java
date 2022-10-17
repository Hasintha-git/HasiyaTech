package com.hasiyatech.hasiyatechapplication.service;

import com.hasiyatech.hasiyatechapplication.DTO.request.User;

import java.util.Optional;

public interface UserService {
    public abstract void saveUser(User user);
    public abstract void updateUser(Integer id, User user);
    public abstract void deleteUser(Integer id);

    public abstract Optional<User> getUsers();

    public abstract User findUser();
}
