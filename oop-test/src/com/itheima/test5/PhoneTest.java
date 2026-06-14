package com.itheima.test5;

public class PhoneTest {
    public static void main(String[] args){
        /*定义数组存储3部手机对象
        手机属性:品牌,价格,颜色
        要求,计算出三部手机的平均价格
         */
        Phone [] arr = new Phone[3];
        arr [0]= new Phone("华为",7000,"金色");
        arr [1]= new Phone("小米",5000,"黑色");
        arr [2]= new Phone("苹果",9000,"银色");
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i].getPrice();
        }
        int avgPrice = sum/arr.length;
        System.out.println(avgPrice);
    }
}
