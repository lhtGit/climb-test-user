package com.example.climb.user;

import com.clomb.swagger.annotations.EnableSwaggerApi;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;

@SpringBootApplication
@MapperScan("com.example.climb.user.dao")
@EnableSwaggerApi
@EnableFeignClients
public class ClimbTestUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClimbTestUserApplication.class, args);
    }

}
