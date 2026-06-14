package com.itheima.arraydemo;

public class ArrayDemo1 {
    public static void main(String[]args) {
        /*
        格式:
        静态舒适化 完整格式: 数据类型[] 数组名 = new 数据类型[]{元素1...};
        简化格式:数据类型[] 数组名 = {元素1,元素2...};
         */
        //1.定义数组存储5个学生的年龄
        int[] arr1 = new int[]{13, 15, 13, 14, 12};
        int[] arr2 = {13, 16, 18, 39, 29};
        //2.定义数组存储3个学生的姓名
        String[] arr3 = new String[]{"张三", "李四", "张飞"};
        String[] arr4 = {"王五", "老刘", "老王"};
        //3.定义数组存储4个学生的身高
        double[] arr5 = new double[]{165.5, 165, 168.0};
        double[] arr6 = {165.0, 165, 164.8};

    }
}
