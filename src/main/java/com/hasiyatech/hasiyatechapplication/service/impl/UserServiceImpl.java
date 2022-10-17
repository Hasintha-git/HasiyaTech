package com.hasiyatech.hasiyatechapplication.service.impl;

import com.hasiyatech.hasiyatechapplication.DTO.request.User;
import com.hasiyatech.hasiyatechapplication.repository.UserRepository;
import com.hasiyatech.hasiyatechapplication.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    
    @Autowired
    public UserRepository userRepository;
    
    @Override
    public void saveUser(User user) {

    }

    @Override
    public void updateUser(Integer id, User user) {

    }

    @Override
    public void deleteUser(Integer id) {

    }

    @Override
    public Optional<User> getUsers() {
        return userRepository.findAllBy();
    }

    @Override
    public User findUser() {
        return userRepository.findUserById(1);
    }
}
