package com.itheima.infiniteloop.test;

import java.util.Random;
import java.util.Scanner;

public class Test4 {
    public static void main(String[]args){
        Random r = new Random();
        int num = r.nextInt(100)+1;
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("请输入你猜的数字");
            int cai = sc.nextInt();
            if(cai == num){
                System.out.println("猜对了");
                break;
            }else if(cai < num){
                System.out.println("小了");
            }else{
                System.out.println("大了");
            }
        }
    }
}
