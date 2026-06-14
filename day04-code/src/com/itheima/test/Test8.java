package com.itheima.test;

import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        //运动计划
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入今天的周数");
        String day = sc.nextLine();
        switch(day){
            case "周一":
                System.out.println("今天该跑步了!");
                break;
            case "周二":
                System.out.println("今天去游泳吧!");
                break;
            case "周三":
                System.out.println("慢走");
                break;
            case "周四":
                System.out.println("动感单车");
                break;
            case "周五":
                System.out.println("拳击");
                break;
            case "周六":
                System.out.println("爬山");
                break;
            case "周日":
                System.out.println("好好吃一顿");
                break;
        }
    }
}
