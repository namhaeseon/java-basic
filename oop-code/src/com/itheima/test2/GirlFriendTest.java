package com.itheima.test2;

public class GirlFriendTest {
    public static void main(String[]agrs){
        //创建女朋友的对象
        GirlFriend q = new GirlFriend();
        q.setName( "qq");
        q.setAge(31);
        q.setGender ("可爱有趣");

        q.getName();
        q.getAge();
        q.getGender();

        System.out.println(q.getName());
        System.out.println(q.getAge());
        System.out.println(q.getGender());

        q.sleep();
        q.eat();

    }
}
