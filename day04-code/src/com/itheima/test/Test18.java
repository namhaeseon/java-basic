package com.itheima.test;

import java.util.Scanner;

public class Test18 {
    static void main(String[] args) {
        /*
        回文数: 给你一个整数x, 如果x是一个回文整数,打印true,否则,返回false
        解释:回文数是指正序和倒序读都是一样的整数
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入任意一个整数");
        int x = sc.nextInt();
        int num = x;
        int temp = x;
        int sum = x;
        int count = 0;
        double result = 0;
        while (num >= 10) {
            num /= 10;
            count++;
        }
        while (count > 0) {
            temp = sum % 10;
            sum /= 10;
            result += temp * Math.pow(10, count);
            count--;
        }
        result += sum;
        System.out.println(result == x ? "true" : "false");


    }
}
