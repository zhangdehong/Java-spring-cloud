package com.hong.math;

import java.util.ArrayList;
import java.util.List;

/**
 * 1000以内所以的质数且对称数，包括个位数  比如 7  11  313 等
 *
 * @Author: zhangdehong
 * @Describe: TODO
 * @Date Create by  12:00 上午 2021/8/26
 */
public class SevenDemo {

    public static void main (String[] args) {
        long start = System.nanoTime();
        List<Integer> result = new SevenDemo().find(1000 * 1000 * 1000);
        long duration = System.nanoTime() - start;
        System.out.println(duration);
        System.out.println(result.size());
    }

    public List<Integer> find (int maxNumber) {

        List<Integer> target = new ArrayList<>(maxNumber + 1);
        for (int i = 2; i < maxNumber; i++) {
            // 判定是质数的同时是对称数
            if (isPrime(i) && isBalance(i)) {
                target.add(i);
                System.out.println(i);
            }
        }
        return target;
    }

    private boolean isPrime (int source) {
        if (source < 1) {
            return false;
        }
        if (source == 2 || source == 3) {
            return true;
        }
        // 不是6的倍数两侧的一定不是质数
        if (source % 6 != 1 && source != 5) {
            return false;
        }
        int sqrt = (int) Math.sqrt(source);
        for (int i = 5; i <= sqrt; i += 6) {
            if (source % i == 0 || source % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    private boolean isBalance (int source) {
        return true;
    }
}
