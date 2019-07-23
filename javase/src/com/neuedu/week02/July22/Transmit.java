package com.neuedu.week02.July22;

public class Transmit {
    public static void main(String[] args){
        int x = 10;
        System.out.println(change(x));
        double y = 10.5;
        change(y);
        System.out.println(y);
    }

    /**
     *
     * 将整数翻倍
     * @param x 传入一个整数
     * @return  返回翻倍后的数
     */
    static int change(int x){
        x *= 2;
        return x;
    }

    /**
     * 改变小数的值
     * @param x 传入的小数
     */
    static void change(double x){
        x = 12.3;
    }
}
