package com.itheima.test;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个整数");
        int num2 = sc.nextInt();
        boolean result1 = num1 == 6;
        boolean result2 = num2 == 6;
        boolean result3 = (num1 + num2) % 6 == 0;
        boolean result = result3 || result2 || result1;
        System.out.println(result);
    }
}
