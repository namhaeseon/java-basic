package com.itheima.stringbuliderdemo;

public class StingBuliderDemo3 {
    public static void main(String[] args) {
        //1.创建对象
        StringBuilder sb = new StringBuilder();
        //2.添加元素
        sb.append("hello world");
        sb.append(1);
        sb.append(10.14);
        sb.append(true);
        //3.反转reverse
        sb.reverse(); //eurt41.011dlrow olleh
        //4/获取长度length
        int length = sb.length();

        System.out.println(sb);
        System.out.println(length);
    }
}
