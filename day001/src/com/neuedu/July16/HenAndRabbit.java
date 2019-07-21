package com.neuedu.July16;

import java.util.Scanner;

public class HenAndRabbit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入头的个数：");
        int head = sc.nextInt();
        System.out.println("请输入腿的个数：");
        int foot = sc.nextInt();
        /**
         * x + y = head
         * 2x + 4y = foot
         * x + 3y = foot - head
         */
        int hen = 0;
        int rabbit = 0;
        boolean test = false;
        if (head >= 0 && foot >= 0) {
            for (rabbit = 0; rabbit <= head; rabbit++) {
                for (hen = 0; hen <= head - rabbit; hen++) {
                    if (hen * 2 + rabbit * 4 == foot && hen + rabbit == head) {
                        System.out.println("共有" + hen + "只鸡，" + rabbit + "只兔子。");
                        test = true;
                    }
                }
            }
        } else {
            System.out.print("您的输入有误！");
        }
        if (!test) {
            System.out.println("计算结果有误！");
        }
    }
}
