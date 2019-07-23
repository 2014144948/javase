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
     * 前一半楼层不去拿取，但要记录最大质量的那个
     *
     * @param i      当前楼层
     * @param carats 质量
     * @param name   名字
     * @param amount 总楼层
     */
    void checkJewel(int i, int carats, String name, int amount) {
        if (carats > wanted) {
            wanted = carats;
            System.out.println(wanted);
        } else {
            getJewel(i, carats, name, wanted, amount);
        }
    }

    /**
     * 拿的方法
     * 后一半楼层发现和之前记录最大质量的差不多重就拿取
     * 将每层质量和记录最大质量的差赋值给数组中的每个元
     * 素，之后去数组中绝对值的最小值
     *
     * @param i
     * @param carats
     * @param name
     * @param wanted
     */
    void getJewel(int i, int carats, String name, int wanted, int amount) {
    }
}
