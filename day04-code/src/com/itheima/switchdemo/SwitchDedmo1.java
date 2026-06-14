package com.itheima.switchdemo;

import java.util.Scanner;

public class SwitchDedmo1 {
    public static void main(String[] args) {
        //兰州拉面,武汉拉面,北京炸酱面,陕西油泼面

        //1.定义变量记录我心里想吃的面
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你现在想吃的面条");
        String noodle = sc.nextLine();
        String noodle1 = "兰州拉面";
        String noodle2 = "武汉拉面";
        String noodle3 = "北京炸酱面";
        String noodle4 = "山西油泼面";
        String noodle5 = "泡面";
        switch (noodle) {
            case "兰州拉面":
                System.out.println("兰州拉面");
                break;
            case "武汉拉面":
                System.out.println("武汉拉面");
                break;
            case "北京炸酱面":
                System.out.println("北京炸酱面");
                break;
            case "山西油泼面":
                System.out.println("山西油泼面");
                break;
            default:
                System.out.println(noodle5);
                break;

        }
    }
}
