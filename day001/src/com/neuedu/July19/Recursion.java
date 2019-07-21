package com.neuedu.July19;

import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        System.out.println("计算整数从min到max的累加和。");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入初始值：");
        int start = sc.nextInt();
        sc.nextLine();
        System.out.println("请输入终止值：");
        int end = sc.nextInt();
        sc.nextLine();
        System.out.println("结果为" + sum(start, end));
    }

    /**
     * 计算整数从min到max的累加和
     *
     * @param min 计算的初始值
     * @param max 计算的终止值
     * @return 返回一个整数
     */
    static int sum(int min, int max) {
        int sum = 0;
        if (min <= max) {
            for (int i = max; i >= min; i--) {
                sum += i;
            }
            return sum;
        } else {
            return -1;
        }
    }
}
