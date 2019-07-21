package com.neuedu.July18;

import java.util.Scanner;

public class BankSystem {
    /**
     * 1.查看余额。
     * 2.存款。
     * 3.取款。
     * 4.转账。
     * 5.退出。
     */
    static Scanner sc = new Scanner(System.in);
    //    初始金额
    static double money = 100000;

    public static void main(String[] args) {
        start();
    }

    static void start() {
        while (true) {
            System.out.println("******************************");
            System.out.println("1.查看余额。");
            System.out.println("2.存款。");
            System.out.println("3.取款。");
            System.out.println("4.转账。");
            System.out.println("5.打印凭证。");
            System.out.println("6.退出。");
            System.out.println("******************************");
            System.out.println("请输入编号：");
            int index = sc.nextInt();
            sc.nextLine();
            switch (index) {
                case 1:
                    checkMoney();
                    break;
                case 2:
                    saveMoney();
                    break;
                case 3:
                    getMoney();
                    break;
                case 4:
                    tranMoney();
                    break;
                case 5:
                    printList();
                    break;
                case 6:
                    exit();
                    return;
                default:
                    error();
                    break;
            }
            System.out.println();
            System.out.println();
        }
    }

    static void checkMoney() {
        System.out.println("当前余额为：" + money + "元。");
    }

    static void saveMoney() {
        System.out.println("请输入您要存款的金额：");
        int add = sc.nextInt();
        sc.nextLine();
        if (add > 0) {
            money += add;
            System.out.println("存款成功！当前余额为：" + money + "元。");
        } else {
            System.out.println("输入不合法。");
        }
    }

    static void getMoney() {
        System.out.println("请输入您要取款的金额：");
        int sub = sc.nextInt();
        sc.nextLine();
        if (sub > 0 && money >= sub) {
            money -= sub;
            System.out.println("取款成功！当前余额为：" + money + "元。");
        } else {
            System.out.println("输入不合法。");
        }
    }

    static void tranMoney() {
        System.out.println("请输入您要转给的卡号：");
        long number = sc.nextLong();
        sc.nextLine();
        System.out.println("请输入转账的金额：");
        int tran = sc.nextInt();
        sc.nextLine();
        if (money >= tran && tran > 0) {
            money -= tran;
            System.out.println("正在向"+number+"转账，请稍等。");
            System.out.println("转账成功！当前余额为：" + money + "元。");
        } else {
            System.out.println("输入不合法。");
        }
    }

    static void printList() {
        System.out.println("凭条打印中，请稍等。");
        System.out.println("打印成功！");
    }

    static void exit() {
        System.out.println("退出。");
    }

    static void error() {
        System.out.println("输入有误！请重新输入。");
    }
}
