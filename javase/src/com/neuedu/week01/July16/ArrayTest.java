package com.neuedu.week01.July16;

import java.util.Random;

public class ArrayTest {
    public static void main(String[] args) {
//        定义数组
        int[] arr = new int[5];

//        赋随机值
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int bound = 101;
            arr[i] = r.nextInt(bound) - bound / 2;
        }

//        输出数据
        System.out.print("数组元素：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

//        最大值
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("最大值为：" + max);

//        最小值
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("最小值为：" + min);

//        总和
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("总和为：" + sum);

//        平均值
        double average = sum / arr.length;
        System.out.println("平均数为：" + average);

    }
}
