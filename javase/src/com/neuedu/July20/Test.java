package com.neuedu.July20;

public class Test {
    public static void main(String[] args) {
        System.out.println(num(12));
    }

    static int num(int a) {
        if (a > 1) {
            return a * num(a - 1);
        } else {
            return 1;
        }
    }
}
