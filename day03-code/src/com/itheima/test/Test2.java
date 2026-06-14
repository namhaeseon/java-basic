package com.itheima.test;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的时髦程度取值为1到10的整数");
        int myFashion = sc.nextInt();
        System.out.println("请输入你的对象的时髦程度,取值范围在1到10的整数");
        int herFashion = sc.nextInt();
        System.out.println(myFashion > herFashion);

    }
}
