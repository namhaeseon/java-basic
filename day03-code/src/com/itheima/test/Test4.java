package com.itheima.test;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args){
        // 动物园里有两只老虎,体重分别为通过键盘录入获得
        //请用程序实现判断两只老虎的体重是否相同
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一只老虎的体重");
        double tiger1 = sc.nextDouble();
        System.out.println("请输入第二只老虎的体重");
        double tiger2 = sc.nextDouble();
        System.out.println(tiger1 == tiger2 ? "相同" : "不相同");

    }
}
