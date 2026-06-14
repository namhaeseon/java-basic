package com.itheima.test;

import java.util.Random;

public class Test2 {
    public static void main(String[] args){
        /*需求:生成10个1~100之间的随机数存入数组
        1.求出所有数据的和
        2.求所有数据的平均数
        3.统计有多少个数据比平均值小
         */
        Random r = new Random();
        int []arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100)+1;
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
        double avy = (double)sum/arr.length;
        System.out.println(avy);
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<avy){
                count++;
            }
        }
        System.out.println(count);
    }
}
