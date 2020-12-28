package com.example.climb.user;

import com.clomb.swagger.annotations.EnableSwaggerApi;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.climb.user.dao")
@EnableSwaggerApi
public class ClimbTestUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClimbTestUserApplication.class, args);
    }

}
