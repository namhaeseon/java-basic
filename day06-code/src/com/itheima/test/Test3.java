package com.itheima.test;

public class Test3 {
    public static void main(String[] args){
        //要能区分出什么时候使用带返回值的方法
        //需求:定义方法,比较两个长方形的面积
        int rect1 = area(4,6);
        int rect2 = area(10,14);
        if(rect1>rect2){
            System.out.println("第一个长方形的面积大于第二个长方形的面积");
        }else if(rect1==rect2){
            System.out.println("两个长方形的面积相同");
        }else{
            System.out.println("第二个长方形的面积大于第一个长方形的面积");
        }
    }
    public static int area(int width, int length){
        int result = width * length;
        return result;
    }
}
