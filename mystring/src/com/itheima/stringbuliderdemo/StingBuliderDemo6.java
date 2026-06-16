package com.itheima.stringbuliderdemo;

import java.util.Scanner;

public class StingBuliderDemo6 {
    public static void main(String[] args) {
        //对称字符串
        //要求:键盘接收一个字符串,程序判断出该字符串是否是对称字符串,并在控制台打印是或不是
        //1.键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();
        //2.用StringBuilder 接收字符串
        StringBuilder sb = new StringBuilder(str);
        //3.将容器内字符串反转并返回String值
        String str2 = sb.reverse().toString();
        //4.比较判断比打印是或不是
        boolean result = str.equals(str2);
        if (result) {
            System.out.println("是");
        } else {
            System.out.println("不是");
        }


    }
}
