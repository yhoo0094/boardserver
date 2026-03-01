package com.fastcampus.boardserver;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class RedisConnectionInfoRunner implements CommandLineRunner {

    private final RedisConnectionFactory redisConnectionFactory;

    @Override
    public void run(String... args) throws Exception {
        try (RedisConnection connection = redisConnectionFactory.getConnection()) {
            log.info("RedisConnectionFactory = {}", redisConnectionFactory.getClass().getName());
            log.info("Redis ping = {}", connection.ping());
            log.info("Redis server info = {}", connection.serverCommands().info("server"));
        }
    }
}