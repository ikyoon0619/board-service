package com.fastcampus.boardservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationPropertiesScan
@SpringBootApplication
public class FastCampusBoardServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(FastCampusBoardServiceApplication.class, args);
    }

}
