package com.neuedu.July.July17;

public class GuluSort {
    public static void main(String[] args){
        System.out.println("冒泡排序法：");
        int[] arr = {5,2,9,1,8,6,3,4,0,7,5};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] < arr[j + 1]){
                    int pao = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = pao;
                }
            }
        }
        for (int i : arr) {
            System.out.println(i);
        }

        System.out.println("数据搜索：");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 6){
                System.out.println(arr[i]);
                break;
            }
            if(i == arr.length - 1){
                System.out.println("数据不存在。");
            }
        }
    }
}
