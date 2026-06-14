package com.itheima.methoddemo;

public class MethodDemo3 {
    public static void main(String[] args){
        //人肉计算器
        //在方法里面定义两个变量并求和打印
        getSum();
    }
    public static void getSum() {
        int num1 = 10;
        int num2 = 14;
        System.out.println(num1+num2);
        int result= num1 + num2;
        System.out.println(result);
    }
}
