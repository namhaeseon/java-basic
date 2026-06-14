package com.itheima.infiniteloop.test;

import java.util.Random;

public class Test2 {
    public static void main(String [] arge){
        //获取随机数
        /*
        先获取一个随机数,
        范围:0~10
         */
        Random r = new Random();
        //3.生成随机数
        //判断技巧:
        //小括号中,书写的是生成随机数的范围
        //这个范围一定是从0开始
        //到这个数-1结束
        //口诀:包头不包尾,包左不包右
        int number = r.nextInt(100);
        System.out.println(number);
    }
}
