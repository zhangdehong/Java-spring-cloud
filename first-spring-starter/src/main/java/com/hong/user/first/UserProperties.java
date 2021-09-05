package com.hong.user.first;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Author: zhang-dehong
 * @Describe: TODO
 * @Date Create by  11:52 下午 2021/3/27
 */
@Data
@ConfigurationProperties(prefix = "spring.user")
public class UserProperties {

    private String name;
}
