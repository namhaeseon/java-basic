package com.itheima.test6;

public class GirlFriend {
    private String name;
    private int age;
    private char gender;
    private String hobby;

    // alt + intsert
    public GirlFriend(){}
    public GirlFriend(String name, int age, char gender, String hobby){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.hobby = hobby;
    }
    public void setName(String name){
     this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void setGender(char gender){
        this.gender = gender;
    }
    public char getGender(){
        return gender;
    }
    public void setHobby(String hobby){
        this.hobby = hobby;
    }
    public String getHobby(){
        return hobby;
    }

}
