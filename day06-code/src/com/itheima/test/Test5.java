package com.itheima.test;

import jdk.swing.interop.SwingInterOpUtils;

import javax.swing.text.DefaultStyledDocument;

public class Test5 {
    public static void main(String[] args) {
        //数组遍历
        //设计一个方法用于数组遍历,要求遍历的结果是在一行上的.
        int[] number = {11, 22, 33, 44, 55};
        printArray(number);
    }

    public static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (i < a.length - 1) {
                System.out.print(a[i] + ",");
            } else {
                System.out.println(a[i]);
            }
        }
    }
}