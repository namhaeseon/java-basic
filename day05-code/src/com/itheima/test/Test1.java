package com.itheima.test;

public class Test1 {
    public static void main(String[]args){
        //求最值
        //已知数组元素为{33,5,22,44,55}
        //求数组中的最大值并打印在控制台
        int[] arr = {33,5,22,44,55};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            max = max>arr[i]? max:arr[i];
        }
        System.out.println(max);
    }
}
