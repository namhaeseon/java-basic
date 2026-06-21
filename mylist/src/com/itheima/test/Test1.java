package com.itheima.test;

import java.util.ArrayList;

public class Test1 {
    static void main(String[] args) {
        //遍历集合
        //1.创建集合
        ArrayList<String> list = new ArrayList<>();
        //2.添加元素
        list.add("壹");
        list.add("贰");
        list.add("叁");
        list.add("肆");
        //3.遍历集合
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if(i == list.size()-1){
                System.out.print(list.get(i));
            }else{
                System.out.print(list.get(i)+",");
            }
        }
        System.out.println("]");

    }


}
