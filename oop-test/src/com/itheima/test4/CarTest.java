package com.itheima.test4;

import java.util.Scanner;

public class CarTest {
    /* 定义数组存储3部汽车对象
    汽车的属性:品牌,价格,颜色
    创建三个汽车对象,数据通过键盘录入而来,并把数据存入到数组当中
     */
    public static void main(String[] args){
        Car [] arr = new Car[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入汽车的品牌");
            Car c = new Car();
            String bland = sc.next();
            c.setBland(bland);
            System.out.println("请输入汽车的价格");
            double price = sc.nextDouble();
            c.setPrice(price);
            System.out.println("请输入汽车的颜色");
            String color = sc.next();
            c.setColor(color);
            arr[i] =c;
        }
        for (int i = 0; i < arr.length; i++) {
            Car car = arr[i];
            System.out.println(car.getBland() +", "+ car.getColor() + ", "+ car.getPrice());
        }
    }

}
