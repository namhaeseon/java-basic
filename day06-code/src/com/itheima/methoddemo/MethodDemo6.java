package com.itheima.methoddemo;

public class MethodDemo6 {
    public static void main(String[] args){
        //使用方式重载的思想,设计比较两个整数是否相同的方法
        //要求兼容全整数类型(byte,short,int,long)
      if(compare(4,6) == 0){
          System.out.println("两个整数相同");
      }else{
          System.out.println("两个整数不相同");
      }
    }
    public static long compare(byte a, byte b){
      long num = a - b;
      return num;
    }
    public static long compare(short a, short b){
      long num = a - b;
      return num;
    }
    public static long compare(int a, int b){
        long num = a - b;
        return num;
    }
    public static long compare(long a, long b){
        long num = a - b;
        return num;
    }

}
