package com.brandon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class AlgoritmiaApplication {
    public static void main(String[] args) {
        SpringApplication.run(AlgoritmiaApplication.class, args);
    }
}
