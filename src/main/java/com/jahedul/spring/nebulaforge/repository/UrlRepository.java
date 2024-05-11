package com.jahedul.spring.nebulaforge.repository;

import com.jahedul.spring.nebulaforge.entity.Url;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UrlRepository extends JpaRepository<Url, Integer> {
    Optional<Url> findByUrl(String url);
}
