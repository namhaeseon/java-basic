package com.itheima.test;

public class ArrTest2 {
    public static void main(String[] args){
        /*
        定义一个数组,存储1,2,3,4,5,6,7,8,9,10
        遍历数组得到每一个元素,统计数组里面一共有多少个能被3整除的数字
         */
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i] % 3;
            if(temp==0){
                sum++;
            }
        }
        System.out.println(sum);
    }
}
