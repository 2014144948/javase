package com.neuedu.week02.July25.enumDemo;

public class Exam1234 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int count = 0;
        for (int i = 123; i <= 432; i++) {
            int bai = i / 100;
            int shi = i % 100 / 10;
            int ge = i % 10;
            boolean b = bai > 0 && bai < 5;
            boolean s = shi > 0 && shi < 5;
            boolean g = ge > 0 && ge < 5;
            if (bai != shi && shi != ge && ge != bai && b && s && g) {
                count++;
                System.out.println(i);
            }
        }
        System.out.println(count + "个");
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
