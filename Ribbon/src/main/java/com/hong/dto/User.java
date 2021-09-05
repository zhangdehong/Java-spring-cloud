package com.hong.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @Author: zhangdehong
 * @Describe: TODO
 * @Date Create by  12:13 上午 2021/4/12
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {

    private int id;
    private String name;
}
