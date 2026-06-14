package com.itheima.test4;

import java.util.Scanner;

public class Car {
        /* 定义数组存储3部汽车对象
    汽车的属性:品牌,价格,颜色
    创建三个汽车对象,数据通过键盘录入而来,并把数据存入到数组当中
     */
    private String bland;
    private double price;
    private String color;

    public Car(){}
    public Car(String bland, double price, String color) {
        this.bland = bland;
        this.price = price;
        this.color = color;
    }

    public void setBland(String bland){
        this.bland = bland;
    }
    public String getBland(){
        return bland;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public double getPrice(){
        return price;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }
}
