package com.hong.math;

/**
 * 快排实现
 *
 * @Author: zhangdehong
 * @Describe: TODO
 * @Date Create by  5:10 下午 2021/8/28
 */
public class QuickSortDemo {

    public static void main (String[] args) {
        int[] num = {1, 3, 8, 5, 2, 9};
        quickSort(num, 0, 5);
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }

    public static void quickSort (int[] source, int left, int right) {
        // 数组下标left必须大于等于right，数组是空数组或者只有一个，直接返回
        if (left > right) {
            return;
        }
        // 设置最左边的数组为基准值 数组中比pivot小的放在左边，比pivot大的放在右边
        int pivot = source[left];

        // 定义两个指针，分别指向最左边和最右边，都是往中间方向移动
        int pointerLeft = left;
        int pointerRight = right;

        // 递归左右半区，和基准值比较，小的放左边，大的放右边
        while (pointerLeft < pointerRight) {
            // pointerRight 向左移动，直到遇到比pivot小的值 先 hold on一下
            while (source[pointerRight] >= pivot && pointerLeft < pointerRight) {
                pointerRight--;
            }
            // pointerLeft 向右，直到遇到比pivot大的值 先 hold on一下
            while (source[pointerLeft] <= pivot && pointerLeft < pointerRight) {
                pointerLeft++;
            }
            // 两厢情愿，pointerLeft和pointerRight指向的数组元素交换
            if (pointerLeft < pointerRight) {
                int temp = source[pointerLeft];
                source[pointerLeft] = source[pointerRight];
                source[pointerRight] = temp;
            }
        }
        // 当前左移指针的值与pivot进行比较
        source[left] = source[pointerLeft];
        source[pointerLeft] = pivot;

        quickSort(source, left, pointerLeft - 1);
        quickSort(source, pointerLeft + 1, right);
    }
}
