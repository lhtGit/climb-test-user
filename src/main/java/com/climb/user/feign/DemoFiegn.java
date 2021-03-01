package com.climb.user.feign;

import com.climb.user.feign.fallback.DemoFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author lht
 * @since 2021/1/19 14:27
 */
@FeignClient(value = "climb-neo4j-demo",fallbackFactory = DemoFallBack.class)
public interface DemoFiegn {
    /**
     * 测试seata分布式事务是否包含了neo4j
     * @author lht
     * @since  2021/1/26 14:36
     * @param
     */
    @GetMapping("add")
    String get();
}
