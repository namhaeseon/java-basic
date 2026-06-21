package com.itheima.test;

import java.util.ArrayList;

public class Test8 {
    static void main(String[] args) {
        //添加手机对象并返回要求的数据
        /*需求:定义javabean类:Phone ---属性:品牌,价格
        main方法中定义一个集合,存入三个手机对象
        分别为:小米1000,苹果8000,锤子2999
        定义一个方法,将价格低于3000的手机信息返回
         */
        //1.定义Phone类
        //2.定义一个集合
        ArrayList<Phone> list = new ArrayList<>();
        //3.存入三个手机对象并添加到集合
        Phone phone1 = new Phone("小米", 1000);
        Phone phone2 = new Phone("苹果", 8000);
        Phone phone3 = new Phone("锤子", 2999);
        list.add(phone1);
        list.add(phone2);
        list.add(phone3);
        //4.定义一个
        ArrayList<Phone> phoneList = getPhoneInfo(list, 3000);
        //5.遍历集合获取每个手机信息
        for (int i = 0; i < phoneList.size(); i++) {
            Phone phone = phoneList.get(i);
            System.out.println(phone.getBrand() + ": " + phone.getPrice());
        }

    }

    //4.定义一个方法,将价格低于3000的手机信息返回
    public static ArrayList<Phone> getPhoneInfo(ArrayList<Phone> list, int price) {
        //定义一个集合用于存储价格低于3000的手机对象
        ArrayList<Phone> phoneList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Phone phone = list.get(i);
            if (list.get(i).getPrice() < price) {
                phoneList.add(phone);
            }
        }
        return phoneList;
    }

}
