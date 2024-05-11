package com.jahedul.spring.nebulaforge.service;

import com.jahedul.spring.nebulaforge.entity.Url;

import java.util.Optional;

public interface UrlService {
    Optional<Url> findByUrl(String url);
}
