package com.itheima.test;

public class Test1 {
    public static void main(String[] args){
        //定义一个方法,求长方形的周长,将结果在方法中进行打印
        //目标:根据不同的需求,选择定义无参的方法,还是带参数的方法
        getLength(10,14);
    }
    public static void getLength (int width, int length){
        int result  = (width + length) * 2;
        System.out.println(result);
    }
}
