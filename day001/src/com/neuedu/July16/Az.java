package com.neuedu.July16;

public class Az {
    public static void main(String[] args){
        for (int i = 97; i < 148; i++) {
            if(i < 123){
                System.out.print((char)i);
            }else{
                System.out.print((char)(244 - i));
            }
        }
    }
}
