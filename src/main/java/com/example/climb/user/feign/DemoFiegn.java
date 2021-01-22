package com.example.climb.user.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

/**
 * @author lht
 * @since 2021/1/19 14:27
 */
@FeignClient(value = "climb-neo4j-demo")
public interface DemoFiegn {
    @GetMapping("add")
    String get();
}
