package com.itheima.a02staticdemo2;

import java.util.StringJoiner;

public class ArrayUtil {
    /*需求:在实际开发中,经常会遇到一些数组使用的工具类
        请按照如下要求编写一个数组的工具类:ArrayUtil
        1.提供一个工具类方法printArr,用于返回整数数组的内容
           返回的字符串格式如:[10,20,50,34,100](只考虑整数数组,且只考虑一维数组)
        2.提供这样一个工具方法getAverage,用于返回平均分(只考虑浮点型数组,且只考虑一维数组)
        3.定义一个测试类TestDemo,调用该工具类的工具方法,并返回结果
         */

//将工具类私有化
    private ArrayUtil() {
    }

    //提供一个工具类方法printArr,用于返回整数数组的内容
    public static String printArr(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1) {
                sb.append(arr[i] + ", ");
            } else {sb.append(arr[i]);
            }

        }
        sb.append("]");
        return sb.toString();
    }

    //提供这样一个工具方法getAverage,用于返回平均分
    public static double getAverage(double[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double avg = sum / arr.length;
        return avg;
    }

    //StringJoiner
    public static String printArr2(int[] arr){
        StringJoiner sj = new StringJoiner(", ","[","]");
        for (int i = 0; i < arr.length; i++) {
            sj.add(String.valueOf(arr[i]));
        }

        return sj.toString();
    }


}
