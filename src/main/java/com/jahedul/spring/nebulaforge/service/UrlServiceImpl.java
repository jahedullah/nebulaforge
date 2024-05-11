package com.jahedul.spring.nebulaforge.service;

import com.jahedul.spring.nebulaforge.entity.Url;
import com.jahedul.spring.nebulaforge.entity.User;
import com.jahedul.spring.nebulaforge.repository.UrlRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UrlServiceImpl implements UrlService{
    private final UrlRepository urlRepository;

    @Override
    public Optional<Url> findByUrl(String url) {
        return urlRepository.findByUrl(url);
    }
}
