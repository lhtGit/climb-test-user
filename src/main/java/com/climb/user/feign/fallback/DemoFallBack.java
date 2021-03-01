package com.climb.user.feign.fallback;

import com.climb.feign.hystrix.BaseFallbackFactory;
import com.climb.user.feign.DemoFiegn;
import org.springframework.stereotype.Component;

/**
 * @author lht
 * @since 2021/1/27 18:19
 */
@Component
public class DemoFallBack extends BaseFallbackFactory<DemoFiegn> {
    @Override
    protected DemoFiegn createObject(Throwable throwable) {
        return new DemoFiegn() {
            @Override
            public String get() {
                return "error";
            }
        };
    }
}
