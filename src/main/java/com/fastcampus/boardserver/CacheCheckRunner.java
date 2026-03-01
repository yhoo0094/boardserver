package com.fastcampus.boardserver;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.cache.CacheManager;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class CacheCheckRunner implements CommandLineRunner {
    private final CacheManager cacheManager;

    @Override
    public void run(String... args) {
        log.info("CacheManager class = {}", cacheManager.getClass().getName());
    }
}