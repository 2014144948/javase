package com.neuedu.July20.jewel;

/**
 * 人
 */
public class You {
//    楼层
    int floor;
//    想要的质量
    int wanted;
    Floor f;
    Jewel j;

    public You(){
        this.floor = 1;
        this.wanted = 1;
    }


    /**
     * 拿
     */
      void getJewel(Floor f, Jewel j, Jewel num){
          if(j.carats >= wanted){
              int a = wanted;
              wanted = j.carats;
              j.carats = a;
              System.out.println("获得第"+f.amount+"层的"+j.carats+"克拉"+j.name+"。");
          }
    }
}
