package com.hong.spring.factory;

import com.hong.spring.entity.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;

/**
 * @Author: zhangdehong
 * @Describe: TODO
 * @Date Create by  11:26 下午 2021/9/5
 */
public class BeanFaaceoryDemo {

    public static void main (String[] args) {
        // BeanFactory   bean工厂 ------->  生产bean对象
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        AbstractBeanDefinition beanDefinition = BeanDefinitionBuilder.genericBeanDefinition().getBeanDefinition();
        beanDefinition.setBeanClass(User.class);
        beanFactory.registerBeanDefinition("user", beanDefinition);
        // beanFactory.registerSingleton("user",new User());
        User user = beanFactory.getBean("user", User.class);
        System.out.println(user);
    }
}
