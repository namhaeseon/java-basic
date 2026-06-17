package com.itheima.stringjoinerdemo;

import java.util.StringJoiner;

public class StringJoinerDemo2 {
    static void main(String[] args) {
        //1.创建对象
        StringJoiner sj = new StringJoiner(", ","[","]");
        //2.添加元素
        sj.add("123").add("456").add("789");
        int length = sj.length();
        System.out.println(length);
        //3.打印结果
        System.out.println(sj);
        String str = sj.toString();
        System.out.println(str);
    }
}
