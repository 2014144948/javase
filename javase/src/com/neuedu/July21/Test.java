package com.neuedu.July21;

public class Test {
    public static void main(String[] args) {
        System.out.println(num(5));
    }

    static int num(int a) {
        if (a > 1) {
            return a * num(a - 1);
        } else {
            return 1;
        }
    }
}
