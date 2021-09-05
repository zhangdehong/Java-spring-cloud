package com.hong.actuator;

import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health;
import org.springframework.stereotype.Component;

/**
 * @Author: zhangdehong
 * @Describe: TODO
 * @Date Create by  12:28 上午 2021/3/29
 */
@Component
public class CustomHealthIndicator extends AbstractHealthIndicator {

    @Override
    protected void doHealthCheck (Health.Builder builder) throws Exception {
        builder.up().withDetail("customInfo", "自定义消息");
    }
}
