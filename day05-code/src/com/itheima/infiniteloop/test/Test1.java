package com.itheima.infiniteloop.test;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Test1 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("请输入一个正整数");
       int num = sc.nextInt();
       int count = 1;
       while(count < num){
          int i =  num % count;
          count++;
          if(i==0 && count != num){
              System.out.println(num+"是质数");
              break;
          }else {
              System.out.println(num + "不是质数");
          }
       }
   }

}
