package com.itheima.test2;

public class GirlFriend {
//属性
    private String name;
    private int age;
    private String gender;

    //针对每一个私有化的成员变量,都要提供 get和set方法
    //set方法:给成员变量赋值
    //get方法:对外提供成员变量的值

    //作用:给成员变量name进行赋值的
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){
        if(age>=18 && age<=50){
            this.age = age ;
        }else{
            System.out.println("非法参数");
        }
    }
    public int getAge(){
        return age;
    }

    //gender
    public void setGender(String gender){
        this.gender = gender;
    }
    public String getGender(){
        return gender;
    }

    //行为
    public void sleep(){
        System.out.println("女朋友在睡觉");
    }
    public void eat(){
        System.out.println("女朋友在吃饭");
    }
}
