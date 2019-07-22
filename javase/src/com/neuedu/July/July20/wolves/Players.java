package com.neuedu.July.July20.wolves;

public class Players {
    //    名称
    private String name;
    //    编号
    private int num;
    //    生存
    private boolean alive;
    //    眼睛
    private boolean open;

    public Players() {
        this.name = name;
        this.num = num;
        this.alive = true;
        this.open = true;

    }


    /**
     * 睁眼和闭眼
     */
    static void changeEyes(boolean open) {
        open = !open;
    }

    /**
     * 发言
     */
    static void speak(){

    }

}
