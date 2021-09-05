package com.hong.user.first;

/**
 * @Author: zhang-dehong
 * @Describe: TODO
 * @Date Create by  11:56 下午 2021/3/27
 */
public class UserClient {

    private UserProperties userProperties;

    public UserClient () {
    }

    public UserClient (UserProperties userProperties) {
        this.userProperties = userProperties;
    }

    public String getName () {
        return userProperties.getName();
    }
}
