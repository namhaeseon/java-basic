package com.itheima.test;

public class Test6 {
    public static void main(String[] args){
        //数组最大值
        //设计一个方法求数组的最大值,并将最大值返回
        int [] number = {22,56,7657,34534,232};
        System.out.println(arrMax(number));
    }
    public static int arrMax(int [] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            max = max > arr[i] ? max : arr[i];
        }
        return max;
    }
}
