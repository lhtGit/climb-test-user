package com.climb.user;

import com.climb.swagger.annotations.EnableSwaggerApi;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@MapperScan("com.climb.user.dao")
@EnableSwaggerApi
@EnableFeignClients
public class ClimbTestUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClimbTestUserApplication.class, args);
    }

}
