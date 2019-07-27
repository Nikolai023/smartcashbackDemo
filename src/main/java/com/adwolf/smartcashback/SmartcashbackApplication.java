package com.adwolf.smartcashback;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@EnableConfigurationProperties
@PropertySource({"classpath:config/admitad.properties"})
public class SmartcashbackApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmartcashbackApplication.class, args);
    }

}
