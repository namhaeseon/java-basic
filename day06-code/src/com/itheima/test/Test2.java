package com.itheima.test;

public class Test2 {
    public static void main(String[] args){
        //定义一个方法,求圆的面积,将结果在方法中进行打印
        circleArea(10.14);
    }
    public static void circleArea(double radius){
        double area = Math.PI*radius*radius;
        System.out.println(area);
    }
}
