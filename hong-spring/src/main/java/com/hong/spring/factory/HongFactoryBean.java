package com.hong.spring.factory;

import com.hong.spring.entity.Person;
import org.springframework.beans.factory.FactoryBean;

/**
 * @Author: zhangdehong
 * @Describe: TODO
 * @Date Create by  10:45 下午 2021/8/15
 */
public class HongFactoryBean implements FactoryBean {

    @Override
    public Object getObject () throws Exception {
        Person person = new Person();
        System.out.println(person);
        return person;
    }

    @Override
    public Class<?> getObjectType () {
        return Person.class;
    }
}
