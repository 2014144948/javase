package com.neuedu.July.July20.jewel;

/**
 * 人
 */
public class You {
    //    楼层
    int floor;
    //    想要的
    int wanted;

    public You() {
        this.floor = 1;
        this.wanted = 1;
    }

    /**
     * 检查的方法
     * @param i      当前楼层
     * @param carats 质量
     * @param name   名字
     * @param amount 总楼层
     */
    void checkJewel(int i, int carats, String name, int amount) {
        if (i <= amount / 2 && carats > wanted) {
            wanted = carats;
            System.out.println(wanted);
        } else if (i > amount / 2) {
            getJewel(i,carats,name);
        }
    }

    /**
     * 拿的方法
     * @param i
     * @param carats
     * @param name
     */
    void getJewel(int i, int carats, String name) {
        System.out.println("获得第" + i + "层的" + carats + "克拉" + name + "。");
    }
}
