package com.itheima.test;

public class Test3 {
    public static void main(String[]args){
        /*交换数组中的数据
        需求:定义一个数组,存入1,2,3,4,5 按照要求交换索引对应的元素
        交换前:1,2,3,4,5
        交换后:5,2,3,4,1
         */
        int [] arr = {1,2,3,4,5};
        int [] temp = new int[5];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        arr[0]=temp[4];
        arr[4]=temp[0];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
