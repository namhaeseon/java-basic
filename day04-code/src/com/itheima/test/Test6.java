package com.itheima.test;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args){
        /*
        根据不同的分数送不同的礼物
        如果是95~100分,送自行车一辆
        如果是90~94分,游乐场玩一天
        如果是80~89分,送变形金刚一个
        如果是80分,揍一顿 */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入考试分数");
        int grade = sc.nextInt();
        if(grade >=0 && grade <=100){
            if(grade >= 95){
                System.out.println("一辆自行车");
            } else if(grade >= 90){
                System.out.println("游乐场一日游");
            } else if (grade >= 80){
                System.out.println("一个变形金刚");
            } else {
                System.out.println("揍一顿!!!");
            }
        } else{
            System.out.println("当前录入的成绩不合规");
        }
    }
}
