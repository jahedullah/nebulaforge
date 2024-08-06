package com.jahedul.spring.nebulaforge.Url;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UrlServiceImpl implements UrlService {
    private final UrlRepository urlRepository;

    @Override
    public Optional<Url> findByUrl(String url) {
        return urlRepository.findByUrl(url);
    }
}
