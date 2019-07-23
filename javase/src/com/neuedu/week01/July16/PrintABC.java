package com.neuedu.week01.July16;

public class PrintABC {
    public static void main(String[] args) {
        System.out.println("输出X。");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == j || j - i == 1 || i + j >= 8 && i + j <= 9) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println("输出A。");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 11; j++) {
                if (i + j == 5 || j - i == 5 || i == 3 && j >= 2 && j <= 8) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println("输出螺旋。");
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 9; j++) {
                boolean a1 = i == 0;
                boolean a2 = i == 6;
                boolean a3 = j == 0;
                boolean a4 = j == 8 && i != 1;
                boolean a5 = i == 2 && j != 1;
                boolean a6 = j == 2 && i != 1 && i != 5;
                boolean a7 = i == 4 && j != 1 && j != 7;
                if (a1 || a2 || a3 || a4 || a5 || a6 || a7) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println("输出心形。");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 13; j++) {
                boolean a1 = i - j == 3;
                boolean a2 = i + j == 15;
                boolean a3 = i <= 2;
                boolean a4 = i + j == 2;
                boolean a5 = j - i == 4;
                boolean a6 = i + j == 8;
                boolean a7 = j - i == 10;
                boolean a8 = i == 0 && j == 3;
                boolean a9 = i == 0 && j == 9;
                if (a1 || a2 || (a3 && (a4 || a5 || a6 || a7 || a8 || a9))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
