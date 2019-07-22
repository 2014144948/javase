package com.neuedu.July.July20.jewel;

import java.util.Random;

public class Jewel {
    //    名字
    String name;
//    编号
     int num;
    //    质量
    int carats;
    //    被得到
    boolean geted;

    Random r = new Random();

    public Jewel(int num) {
        this.name = "钻石";
        this.num = num;
        this.carats = r.nextInt(100) + 1;
        this.geted = false;
        System.out.println(name + num + "的质量是：" + carats + "克拉。");
    }
}
