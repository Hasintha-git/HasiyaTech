package com.hasiyatech.hasiyatechapplication.repository;

import com.hasiyatech.hasiyatechapplication.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Integer> {
    Optional<User> findAllByUserName(String userName);
}
