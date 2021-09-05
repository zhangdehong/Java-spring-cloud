package com.hong.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: zhangdehong
 * @Describe: TODO
 * @Date Create by  11:54 下午 2021/4/11
 */
@Configuration
public class RestConfiguration {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate () {
        return new RestTemplate();
    }
}
