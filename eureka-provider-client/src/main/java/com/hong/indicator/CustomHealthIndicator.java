package com.hong.indicator;

import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health;
import org.springframework.stereotype.Component;

/**
 * @Author: zhangdehong
 * @Describe: TODO
 * @Date Create by  10:51 下午 2021/3/31
 */
@Component
public class CustomHealthIndicator extends AbstractHealthIndicator {

    private boolean status = true;

    public void setStatus (boolean status) {
        this.status = status;
    }

    @Override
    protected void doHealthCheck (Health.Builder builder) throws Exception {
        if(status){
            builder.up();
        }else {
            builder.down();
        }
    }
}
