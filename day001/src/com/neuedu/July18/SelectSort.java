package com.neuedu.July18;

public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {5, 0, 3, 1, 2};
        selectsort(arr);
        for (int x : arr) {
            System.out.println(x);
        }
    }

    /**
     * 将传入的int数组进行选择排序后返回
     * @param arr   即将要排序的数组
     * @return      返回排序后的数组
     */
    static int[] selectsort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
        return arr;
    }
}
