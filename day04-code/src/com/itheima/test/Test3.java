package com.itheima.test;

import java.util.Scanner;

public class Test3 {
    static void main(String[] args) {
        /*
        键盘录入一个整数,表示身上的钱
        如果大于等于100块,就是网红餐厅
        否则,就吃经济实惠的沙县小吃
         */
        Scanner sc = new Scanner(System.in) ;
        System.out.println("请输入你现在身上还剩的钱");
        int money = sc.nextInt();
        if (money >= 100){
            System.out.println("有钱,去吃网红餐厅");
        } else{
            System.out.println("没钱,还是去吃沙县小吃吧");
        }
    }
}
