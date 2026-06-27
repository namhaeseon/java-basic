package com.itheima.a03staticdemo3;

import java.util.ArrayList;

public class StudentUtil {
    //将工具类私有化
    private StudentUtil() {}

    //定义一个工具类,用于获取集合中最大学生的年龄
    public static int BigAge(ArrayList<Student> list) {
        //定义一个参照物
        int age = list.get(0).getAge();
        for (int i = 1; i < list.size(); i++) {
            int tempAge = list.get(i).getAge();
            if(tempAge > age ){
                age = tempAge;
            }
        }
            return age;
        }
    }

