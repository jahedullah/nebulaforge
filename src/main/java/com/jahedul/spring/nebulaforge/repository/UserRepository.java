package com.jahedul.spring.nebulaforge.repository;

import com.jahedul.spring.nebulaforge.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
