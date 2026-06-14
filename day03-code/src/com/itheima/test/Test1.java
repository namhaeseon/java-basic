package com.itheima.test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数");
        int num = sc.nextInt();
        int A = num / 100 % 10;
        int B = num / 10 % 10;
        int C = num % 10;
        System.out.println("百位是" + A);
        System.out.println("十位是" + B);
        System.out.println("个位是" + C);

    }
}
