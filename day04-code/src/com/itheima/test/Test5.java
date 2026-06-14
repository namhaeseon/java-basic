package com.itheima.test;

import java.util.Scanner;

public class Test5 {
    /*
    实际开发中,电影院选座也会使用到if判断
    假设某影院售卖了100张票, 票的序号为1~100
    其中奇数票号坐左侧, 偶数票号坐右侧
    键盘录入一个整数表示电影票的票号
    根据不同情况,给出不同的提示
    如果票号为奇数,打印坐左边
    如果票号为偶数,打印坐右边
     */
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的电影票票号,票号范围为1~100");
        int seatNum = sc.nextInt();
        if (seatNum >0 && seatNum<=100){
            if(seatNum % 2 == 1){
                System.out.println("请坐左侧");
            } else {
                System.out.println("请坐右侧");
            }
        }
        }

}
