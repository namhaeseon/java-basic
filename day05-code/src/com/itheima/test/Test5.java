package com.itheima.test;

import java.util.Random;

public class Test5 {
    public static void main(String[]args){
        //需求:定义一个数组,存入1~5,要求打乱数组中所有数据的顺序
        Random r = new Random();
        int [] arr ={1,2,3,4,5};
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            int randomIndex = r.nextInt(arr.length);
            arr[i] =  arr[randomIndex];
            arr[randomIndex] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }


    }
}
