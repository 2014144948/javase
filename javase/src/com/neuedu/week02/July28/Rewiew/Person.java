package com.neuedu.week02.July28.Rewiew;

public class Person {
    String name;
    static String food;

    public Person(String name) {
        this.name = name;
    }

    public static void eat(){
        System.out.println("eat");
    }

    public void play(){
        System.out.println("play");
    }
}
