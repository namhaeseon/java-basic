package com.itheima.a01staticdemo1;

public class StudentTest {
    public static void main(String[] args) {
        //1.创建第一个学生对象
        Student st1 = new Student();
        Student st2 = new Student();
        Student st3 = new Student();
        Student.techerName = "阿伟老师";
        st3.setName("凉凉");
        st3.setAge(19);
        st3.setGender("女");

        st1.study();
        st3.show();
        st2.show();


    }









}
