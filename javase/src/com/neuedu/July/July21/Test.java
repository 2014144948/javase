package com.neuedu.July.July21;

public class Test {
    public static void main(String[] args) {
        System.out.println(num(5));
    }

    /**
     * 用递归计算阶乘
     *
     * @param a 阶乘的最大值
     * @return 返回计算结果
     */
    static int num(int a) {
        if (a > 1) {
            return a * num(a - 1);
        } else {
            return 1;
        }
    }
}
