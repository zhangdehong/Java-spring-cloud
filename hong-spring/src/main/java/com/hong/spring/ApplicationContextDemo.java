package com.hong.spring;

import com.hong.spring.entity.User;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.io.Resource;

/**
 * @Author: zhangdehong
 * @Describe: TODO
 * @Date Create by  11:47 下午 2021/9/5
 */
public class ApplicationContextDemo {

    public static void main (String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        AbstractBeanDefinition beanDefinition = BeanDefinitionBuilder.genericBeanDefinition().getBeanDefinition();
        beanDefinition.setBeanClass(User.class);
        applicationContext.registerBeanDefinition("user",beanDefinition);

        applicationContext.refresh();

        System.out.println(applicationContext.getBean("user",User.class));
        ConfigurableEnvironment environment = applicationContext.getEnvironment();
        // System.out.println(environment);
        System.out.println(environment.getSystemProperties());

        Resource resource = applicationContext.getResource("/Users/zhangdehong/develop/project/web/Java-spring-cloud/hong-spring/src/main/resources/spring.xml");
        System.out.println(resource);

    }
}
