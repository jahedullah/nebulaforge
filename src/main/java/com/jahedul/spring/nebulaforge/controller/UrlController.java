package com.jahedul.spring.nebulaforge.controller;

import com.jahedul.spring.nebulaforge.service.UrlService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/urls")
@RequiredArgsConstructor
public class UrlController {
    private final UrlService urlService;

    @GetMapping
    public boolean isUrlMalicious(@RequestParam String url) {
        return urlService.findByUrl(url).isPresent();
    }

}
