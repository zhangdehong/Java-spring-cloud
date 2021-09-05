package com.hong;

import com.netflix.loadbalancer.*;
import com.netflix.loadbalancer.reactive.LoadBalancerCommand;
import com.netflix.loadbalancer.reactive.ServerOperation;
import rx.Observable;

import java.util.Arrays;
import java.util.List;

/**
 * Ribbon 原生API使用
 *
 * @Author: zhangdehong
 * @Describe: TODO
 * @Date Create by  11:19 下午 2021/4/6
 */
public class RibbonNativeClientDemo {

    public static void main (String[] args) {
        // 服务列表
        List<Server> serverList = Arrays.asList(
                new Server("localhost", 8081), new Server("localhost", 8083)
        );
        // 构建负载实例
        BaseLoadBalancer loadBalancer = LoadBalancerBuilder.newBuilder().buildFixedServerListLoadBalancer(serverList);
        loadBalancer.setRule(new RandomRule());
        for (int i = 0; i < 5; i++) {
            String result = LoadBalancerCommand.<String>builder().withLoadBalancer(loadBalancer).build()
                    .submit(new ServerOperation<String>() {
                        @Override
                        public Observable<String> call (Server server) {
                            try {
                                String addr = "http://" + server.getHost() + ":" + server.getHostPort();
                                System.out.println("调用地址：" + addr);
                                return Observable.just("");
                            } catch (Exception e) {
                                return Observable.error(e);
                            }
                        }
                    }).toBlocking().first();
            System.out.println("调用结果：" + result);
        }
    }
}
