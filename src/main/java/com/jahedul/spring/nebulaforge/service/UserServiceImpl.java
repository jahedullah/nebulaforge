package com.jahedul.spring.nebulaforge.service;

import com.jahedul.spring.nebulaforge.entity.User;
import com.jahedul.spring.nebulaforge.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    @Transactional(readOnly = true)
    public Optional<User> getUserById(int id) {
        return userRepository.findById(id);
    }
}
