package com.jahedul.spring.nebulaforge.User;

import java.util.Optional;

public interface UserService {
    Optional<User> getUserById(int id)
            ;
}
