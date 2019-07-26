package com.neuedu.week02.July26;

public class Exam1234 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int count = 0;
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                for (int k = 1; k < 5; k++) {
                    if(i != j && j != k && k != i){
                        count++;
                        System.out.println(i+""+j+""+k);
                    }
                }
            }
        }
        System.out.println(count + "个");
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
