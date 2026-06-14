package com.itheima.test1;

public class PhoneTest {
    public static void main(String[] args) {
        //创建手机的对象
        Phone P = new Phone();

        //给手机赋值
        P.brand = "小米";
        P.price = 4000;

        //获取手机对象中的值
        System.out.println(P.brand);
        System.out.println(P.price);

        //调用手机中的方法即可
        P.call();
        P.playGame();

    }
}
