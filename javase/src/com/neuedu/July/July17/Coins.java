package com.neuedu.July.July17;

public class Coins {
    public static void main(String[] args) {
        System.out.println("共有50枚硬币，总价值为20元。");
        int num = 50;
        double worth = 20.0;
        int sum = 0;
        for (int i = 0; i <= num; i++) {
            for (int j = 0; j <= num - i; j++) {
                for (int k = 0; k <= num - i - j; k++) {
                    int l = num - i - j - k;
                    if ((i + j * 0.5 + k * 0.1 + l * 0.05) == worth) {
                        sum++;
                        System.out.println("一元：" + i + "个，五角：" + j + "个，一角：" + k + "个，五分：" + l + "个。");
                    }
                }
            }
        }
        System.out.println("共有" + sum + "种方案。");
    }
}
