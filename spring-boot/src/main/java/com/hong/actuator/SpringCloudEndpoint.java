package com.hong.actuator;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * <h1>自定义断点实现</h1>
 *
 * @Author: zhangdehong
 * @Describe: TODO
 * @Date Create by  12:36 上午 2021/3/29
 */
@Component
@Endpoint(id = "spring-cloud")
public class SpringCloudEndpoint {

    @ReadOperation
    public Map<String, Object> endpoint () {
        Map<String, Object> data = new HashMap<>();
        data.put("title", "Spring Cloud");
        return data;
    }
}
