package com.hong.user.first;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @Author: zhangdehong
 * @Describe: TODO
 * @Date Create by  12:52 上午 2021/3/28
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import({UserAutoConfigure.class})
public @interface EnableUserClient {

}
