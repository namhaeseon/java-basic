package com.itheima.test;

import java.lang.classfile.instruction.DiscontinuedInstruction;
import java.util.Scanner;

public class Test1 {
    static void main(String[] args) {
        //转换罗马数字
        /*键盘录入一个字符串,长度为小于等于9,只能是数字,将内容变成罗马数字
        下面是阿拉伯数字跟罗马数字的对比关系:
        I-1,II-2,III-3,IV-4,V-5,VI-6,VII-7,VIII-8,IX-9
        注意点:
        罗马数字里面是没有0的
        如果键盘录入的数字包含0,可以变成""(长度为0的字符串)*/

        //1.键盘录入一个字符串
        String str;
        System.out.println("请输入一段字符串");
        while (true) {
            Scanner sc = new Scanner(System.in);
            str = sc.next();
            //2.设置一个方法对字符串进行校验
            boolean flag = checkStr(str);
            if (flag) {
                break;
            } else {
                System.out.println("输入的字符串有误,请重新输入字符串");
                continue;
            }
        }
        //3.设置方法:查表法--将数字与数组索引一一对应
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            int number = str.charAt(i)-48;
            String s= changeLuoma(number);
            sb.append(s);
        }
        System.out.println(sb.toString());

    }

    //3.设置方法:查表法--将数字与数组索引一一对应
    public static String changeLuoma(int number){
        String [] arr ={"","I","II","III","IV","V","VI","VII","VIII","IX"};
        return arr[number];
    }


    //2.设置方法对字符串进行校验
    public static boolean checkStr(String str) {
        if (str.length() > 9) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) > '9' || str.charAt(i) < '0') {
                return false;
            }
        }
        return true;
    }
}
