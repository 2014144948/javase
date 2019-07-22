package com.neuedu.July.July16;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("斐波那契数列：");
        int a1 = 1;
        int a2 = 1;
        System.out.print(a1 + "  "+a2 + "  ");
        for (int b = 0;b < 1000; b++) {
            b = a1 + a2;
            if(b < 1000){
                System.out.print(b + "  ");
            }
            a1 = a2;
            a2 = b;
        }
    }
}
