package com.fastcampus.boardserver;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class RedisScanRunner implements CommandLineRunner {

    private final StringRedisTemplate stringRedisTemplate;

    @Override
    public void run(String... args) {
        log.info("All redis keys from app = {}", stringRedisTemplate.keys("*"));
    }
}