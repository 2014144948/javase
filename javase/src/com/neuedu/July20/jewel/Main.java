package com.neuedu.July20.jewel;

public class Main {

    public static void main(String[] args) {
        Floor f = new Floor();
        You y = new You();
        for (int i = 1; i <= f.amount; i++, y.floor++) {
            Jewel j = new Jewel(i);
            y.checkJewel(i, j.carats, j.name,f.amount);
        }
    }
}
