package com.itheima.test;

import java.util.Scanner;

public class Test1 {
    /*卖飞机票
    需求:机票价格按照淡季旺季,头等舱和经济舱收费,输入机票原价,月份和头等舱或经济舱
    按照如下规则计算机票价格:淡季(5-10月)头等舱9折,经济舱8.5折,淡季(11月到来年的4月)头等舱7折,经济舱6.5折
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入月份");
        int month = sc.nextInt();
        System.out.println("请输入机票原价");
        int airPrice = sc.nextInt();
        System.out.println("请输入是购买经济舱还是头等舱");
            String seat = sc.next();
        switch (seat){
            case "经济舱":
            if (month>=5 && month<=10){
                airPrice *= 0.85;

            }else if(month>=1 && month<5){
                airPrice *= 0.65;
            }else if(month>=11 && month<=12){
                airPrice *= 0.65;
            }
            break;
            case "头等舱":
                if (month>=5 && month<=10){
                airPrice *= 0.9;

            }else if(month>=1 && month<5){
                    airPrice *= 0.7;
            }else if(month>=11 && month<=12){
                airPrice *= 0.7;
            }
        }

        System.out.println("票价为" + airPrice);
        }

}


