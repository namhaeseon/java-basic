package com.itheima.stringdemo;

public class StringDemo7 {
    static void main(String[] args) {
        //拼接字符串
        //定义一个方法,把int数组中的数据按照指定的格式拼接成一个字符串返回,调用该方法,并在控制台输出结果
        int[] arr = {1, 2, 3};
        String num = arrtostring(arr);
        System.out.println(num);

    }

    public static String arrtostring(int[] arr) {
        String str = "[";
        if (arr == null) {
            return "";
        } else if (arr.length == 0) {
            return "[]";
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (i == arr.length - 1) {
                    str = str + arr[i] + "]";
                    break;
                } else {
                    str = str + arr[i] + ", ";
                }
            }

            return str;
        }
    }
}
