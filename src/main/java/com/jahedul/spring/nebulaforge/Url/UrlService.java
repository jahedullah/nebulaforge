package com.jahedul.spring.nebulaforge.Url;

import java.util.Optional;

public interface UrlService {
    Optional<Url> findByUrl(String url);
}
