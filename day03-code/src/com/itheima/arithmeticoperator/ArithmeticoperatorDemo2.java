package com.itheima.arithmeticoperator;

import java.util.Scanner;

public class ArithmeticoperatorDemo2 {
    public static void main(String[] args) {
        // \
        System.out.println(10/5); //2
        System.out.println(10/3); //3,整数参与计算只能得到整数
        System.out.println(10.0 / 3); //想要有小数必须有小数参与计算

        //取模
        System.out.println(10 % 2); //0
        System.out.println(10 % 3); // 1

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数");
        int num = sc.nextInt();
        int A = num / 100 % 10;
        int B = num / 10 % 10;
        int C = num % 10;
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);


    }
}
