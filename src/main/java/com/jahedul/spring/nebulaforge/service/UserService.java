package com.jahedul.spring.nebulaforge.service;

import com.jahedul.spring.nebulaforge.entity.User;

import java.util.Optional;

public interface UserService {
    Optional<User> getUserById(int id)
            ;
}
