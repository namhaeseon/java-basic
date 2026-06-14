package com.itheima.test;

import java.util.Scanner;

public class Test11 {
    public static void main(String[] agrs){
        /*在实际开发中, 如果我们需要在多种情况下选择其中一个,就可以使用switch语句
        当我们拨打了某些服务电话时,一般都会有按键选择
        假设现在我们拨打了一个机票预订电话
        电话中语音提示:
        1机票查询
        2机票预订
        3机票改签
        4退出服务
        其他按键也是退出服务. 请用switch模拟该逻辑业务
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字");
        int num = sc.nextInt();
        switch(num){
            case 1 -> System.out.println("机票查询");
            case 2 -> System.out.println("机票预订");
            case 3 -> System.out.println("机票改签");
            //case 4 -> System.out.println("退出服务");
            default -> System.out.println("退出服务");
        }
    }
}
