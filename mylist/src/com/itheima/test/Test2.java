package com.itheima.test;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Test2 {
    static void main(String[] args) {
        //添加数字并遍历
        /*需求:定义一个集合,添加数字,并进行遍历
        遍历格式参照:[元素1, 元素2, 元素3]
         */

        //**基本数据类型要进行包装**
        //1.创建集合
        ArrayList<Integer> list = new ArrayList<>();
        //2.添加元素
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        //3.遍历数组
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                System.out.print(list.get(i));
            } else {
                System.out.print(list.get(i) + ",");
            }
        }
       System.out.println("]");


    }


}
