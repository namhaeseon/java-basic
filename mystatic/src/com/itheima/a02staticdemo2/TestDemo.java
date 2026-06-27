package com.itheima.a02staticdemo2;

public class TestDemo {
    static void main(String[] args) {
/*需求:在实际开发中,经常会遇到一些数组使用的工具类
        请按照如下要求编写一个数组的工具类:ArrayUtil
        1.提供一个工具类方法printArr,用于返回整数数组的内容
           返回的字符串格式如:[10,20,50,34,100](只考虑整数数组,且只考虑一维数组)
        2.提供这样一个工具方法getAverage,用于返回平均分(只考虑浮点型数组,且只考虑一维数组)
        3.定义一个测试类TestDemo,调用该工具类的工具方法,并返回结果
         */
//测试工具类的方法是否正确
        //调用方法: 类名.+方法名
        int [] arr = {10,20,30,40,57};
        double [] arr2 = {10.0,20,30.0,40.0,57};
        String str1 = ArrayUtil.printArr(arr);
        String str2 = ArrayUtil.printArr2(arr);
        double average = ArrayUtil.getAverage(arr2);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(average);

    }
}
