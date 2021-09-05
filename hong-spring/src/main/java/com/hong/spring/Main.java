package com.hong.spring;

import com.hong.spring.config.Config;
import com.hong.spring.entity.User;
import com.hong.spring.factory.HongFactoryBean;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.function.Supplier;

/**
 * @Author: zhangdehong
 * @Describe: TODO
 * @Date Create by  9:43 下午 2021/8/15
 */
public class Main {

    // public static void main (String[] args) {
    //     // <bean/>
    //     // @Bean
    //     // @ComponentScan
    //     // 编程式 BeanDefinition
    //
    //     // ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
    //     // AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
    //     AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
    //
    //     // AbstractBeanDefinition beanDefinition = BeanDefinitionBuilder.genericBeanDefinition().getBeanDefinition();
    //     // // 生成两个bean对象
    //     // beanDefinition.setBeanClass(HongFactoryBean.class);
    //     //
    //     // applicationContext.registerBeanDefinition("user",beanDefinition);
    //
    //     applicationContext.register(User.class);
    //     applicationContext.registerBean(User.class, new Supplier<User>() {
    //         @Override
    //         public User get () {
    //             User user = new User();
    //             user.setName("XXX");
    //             System.out.println(user);
    //             return user;
    //         }
    //     });
    //     applicationContext.refresh();
    //     User user = applicationContext.getBean("user", User.class);
    //     System.out.println(user.getName());
    //     System.out.println(user);
    // }

    public static void main (String[] args) {
        // 单例池  concurrentHashMap singletonObject<beanName,Object>
        // 单例 原型(多例)

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        // AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        // 默认单例
        // applicationContext.registerBean(User.class);
        applicationContext.refresh();
        System.out.println(applicationContext.getBean("user"));
        System.out.println(applicationContext.getBean("user"));
        System.out.println(applicationContext.getBean("user1"));
        System.out.println(applicationContext.getBean("user1"));
    }
}
