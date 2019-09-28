package com.adwolf.smartcashback;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
public class SmartcashbackApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmartcashbackApplication.class, args);
    }

}
