package com.itheima.test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        //小红: 如果你这次考试全班第一,我就做你的女朋友
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你这次考试的成绩排名");
        int grade = sc.nextInt();
        if (grade == 1) {
            System.out.println("我是你的女朋友了");
        }

    }
}
