package com.itheima.test;

import java.util.ArrayList;

public class Test4 {
    static void main(String[] args) {
        //添加学生对象并遍历
        /*定义一个集合,添加一些学生对象,并进行遍历
        学生类的属性为:姓名,年龄
         */
        //0.创建学生类
        //1.创建对象
        ArrayList<Student> list = new ArrayList<>();
        //2.创建学生对象
        Student s1 = new Student("QQ",30);
        Student s2 = new Student("KK",20);
        //3.添加元素
        list.add(s1);
        list.add(s2);
        //4.遍历集合
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getName() + ", " + stu.getAge());
        }




    }


}
