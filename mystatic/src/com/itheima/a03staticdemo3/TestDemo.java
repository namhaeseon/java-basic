package com.itheima.a03staticdemo3;

import java.util.ArrayList;

public class TestDemo {
    public static void main(String[] args) {
        /*需求:定义一个集合,用于存储3个学生对象
        学生类的属性为:name,age,gender
        定义一个工具类,用于获取集合中最大学生的年龄*/

        //创建学生类--完成
        //定义一个集合,存储3个学生对象
        ArrayList<Student> list = new ArrayList<>();
        Student s1 = new Student("张三", 20, "男");
        Student s2 = new Student("李四", 30, "男");
        Student s3 = new Student("凉凉", 32, "女");
        list.add(s1);
        list.add(s2);
        list.add(s3);
        //定义一个工具类,用于获取集合中最大学生的年龄--完成 
        int bigAge = StudentUtil.BigAge(list);
        System.out.println(bigAge);

    }


}
