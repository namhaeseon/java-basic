package com.itheima.test;

public class Test8 {
    //复制数组
    //定义一个方法copyOfRange(int[]arr,int from,int to)
    //将数组arr中从索引from(包含)开始到索引to(不包含)的元素复制到新数组中,将新数组返回
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int[] copy = copyOfRange(arr, 3, 6);
        for (int i = 0; i < copy.length; i++) {
            System.out.print(copy[i] + " ");
        }
    }


    public static int[] copyOfRange(int[] arr, int from, int to) {
        int[] newArr = new int[to - from];
        int index = 0;
        for (int i = from; i < to; i++) {
            newArr[index] = arr[i];
            index++;
        }
        return newArr;
    }
}