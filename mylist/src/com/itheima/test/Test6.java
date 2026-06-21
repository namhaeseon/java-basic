package com.itheima.test;

import java.util.ArrayList;

public class Test6 {
    static void main(String[] args) {
        //添加对象并判断是否存在
        /*需求:main方法中定义一个集合,存入三个用户对象
        用户属性为:id,username,password
        要求:定义一个方法,根据id查找对应的用户信息
        如果存在,返回true,如果不存在返回false
         */
        //1.创建集合
        ArrayList<User> list = new ArrayList<>();
        //2.定义三个用户对象
        User user1 = new User("001","QQ","123456");
        User user2 = new User("002","KK","000000");
        User user3 = new User("003","JJ","111111");
        //3.将用户对象存入到集合里
        list.add(user1);
        list.add(user2);
        list.add(user3);
        //4.调用方法,查看id是否存在
        boolean result = result("000", list);
        System.out.println(result);
    }

    //4.定义一个方法,根据id查找对应的用户信息
    public static boolean result(String id,ArrayList<User> list){
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            if(id.equals(user.getId())){
                return true;
            }
        }
             return false;
    }



}
