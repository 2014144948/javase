package com.neuedu.July.July22.staticDemo;

public class Test {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        Cat c2 = new Cat();
        c1.name = "大猫";
        System.out.println(c1.name);
        System.out.println(c2.name);
        c2.name = "小猫";
        System.out.println(c1.name);
        System.out.println(c2.name);
    }

}
