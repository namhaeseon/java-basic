package com.itheima.test6;

public class User {

    private String username;
    private String password;
    private String mail;
    private String gender;
    private int age;

    //快捷键:
    //alt + insert
    //alt + fn + insert

    //插件PTG 1秒生成标准javabean  

    public User(){};
    public User(String username, String password, String mail, String gender, int age ){
        this.username = username;
        this.password = password;
        this.mail = mail;
        this.gender = gender;
        this.age = age;
    }
    public void setUserame(String username){
        this.username = username;
    }
    public String getUsername(){
        return username;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public String getPassword(){
        return password;
    }
    public void setMail(String mail){
        this.mail = mail;
    }
    public String getMail(){
        return mail;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public String getGender(){
        return gender;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
}
