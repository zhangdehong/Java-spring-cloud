package com.hong.math;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: zhangdehong
 * @Describe: TODO
 * @Date Create by  3:12 下午 2021/9/5
 */
public class GroupDemo {

    private static final String KEY1 = "hong_1";
    private static final String KEY2 = "hong_2";
    private static final String KEY3 = "hong_3";
    private static final String KEY4 = "hong_4";
    private static final String KEY5 = "hong_5";
    private static final String KEY6 = "hong_6";
    private static final String KEY7 = "hong_7";

    public static void main (String[] args) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < 1000; i++) {
            if (i / 2 == 2) {
                map.put(KEY1, i);
            }
            if (i / 3 == 3) {
                map.put(KEY2, i);
            }
            if (i / 4 == 4) {
                map.put(KEY3, i);
            }
            if (i / 5 == 5) {
                map.put(KEY4, i);
            }
            if (i / 6 == 6) {
                map.put(KEY5, i);
            }
            if (i / 7 == 7) {
                map.put(KEY6, i);
            }
            if (i / 8 == 8) {
                map.put(KEY7, i);
            }
        }
    }
}
