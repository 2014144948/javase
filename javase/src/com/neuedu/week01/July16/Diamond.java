package com.neuedu.week01.July16;

public class Diamond {
    public static void main(String[] args) {
        System.out.println("输出菱形。");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (i + j >= 4 && i + j <= 12 && i - j <= 4 && j - i <= 4) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
