package com.neuedu.week01.July16;

public class WaterNumber {
    public static void main(String[] args) {
        System.out.println("输出所有的水仙花数：");
        for (int i = 100; i < 1000; i++) {
            int a = i / 100;
            int b = i % 100 / 10;
            int c = i % 10;
            if (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3) == i) {
                System.out.println(i);
            }
        }
    }
}
