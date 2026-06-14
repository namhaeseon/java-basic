package com.itheima.stringdemo;

import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.util.Scanner;

public class StringDemo8 {
    static void main(String[] args) {
        //字符串反转
        /*定义一个方法,实现字符串反转
        键盘录入一个字符串,调用该方法后,在控制台输出结果
        例如:键盘录入abc,输出cba*/
        //1.键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入一个字符串");
        String str = sc.next();
        //String result = str3(str);
        //System.out.println(result);
        String result = reverse(str);
        System.out.println(result);

    }

    /*public static String str3(String str){
        String str1 = "";
        for (int i = 0; i < str.length(); i++) {
            char c  = str.charAt(i);
            str1 =c + str1 ;
            }
        return str1;
    }

     */
    public static String reverse(String str) {
        String result = "";
        for (int i = str.length()-1; i >= 0; i--) { // forr倒着遍历,shift+F6可以批量更改变量
            char c = str.charAt(i);
            result += c;
        }
        return result;
    }
}