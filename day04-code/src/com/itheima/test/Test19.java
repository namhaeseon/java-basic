package com.itheima.test;

import java.util.Scanner;

public class Test19 {
    public static void main(String[] args){
        /*需求:给定两个整数,被除数和除数(都是整数,且不超过int的范围).
        将两数相处,要求不适用乘法,除法和%运算符
        得到商和余数
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个正整数");
        int num1=sc.nextInt();
        System.out.println("请输入第二个正整数");
        int num2 = sc.nextInt();
        int count = 0;
        int max = num1>=num2 ? num1:num2;
        int min = num1< num2? num1:num2;
        while(max>=min){
            max -= min;
            count++;
        }
        System.out.println("商为" + count);
        System.out.println("余数为" + max);
    }
}
