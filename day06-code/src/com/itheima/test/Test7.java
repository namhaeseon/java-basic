package com.itheima.test;

public class Test7 {
    public static void main(String[] args) {
        //判断是否存在
        //定义一个方法判断数组中的某一个数是否存在,将结果返回给调用处
        int[] arr = {1, 10, 14, 20, 36, 7};
        contains(arr, 10);
        System.out.println( contains(arr, 10));


    }

    public static boolean contains(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return true;
            }
        }
        return false;

    }
}