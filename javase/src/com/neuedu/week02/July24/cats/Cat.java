package com.neuedu.week02.July24.cats;

public class Cat {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Cat(){
        System.out.println("我是一只猫，我被new出来了。");
    }

    void miao(){
        System.out.println("我们一起学猫叫，一起喵喵喵喵喵。");
    }
}
