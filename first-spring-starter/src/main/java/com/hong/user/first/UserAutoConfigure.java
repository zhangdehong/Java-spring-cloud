package com.hong.user.first;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: zhang-dehong
 * @Describe: TODO
 * @Date Create by  11:54 下午 2021/3/27
 */
@Configuration
@EnableConfigurationProperties(UserProperties.class)
public class UserAutoConfigure {

    @Bean
    @ConditionalOnProperty(prefix = "spring.user",value = "enabled",havingValue = "true")
    public UserClient userClient(UserProperties userProperties){
        return new UserClient(userProperties);
    }
}
