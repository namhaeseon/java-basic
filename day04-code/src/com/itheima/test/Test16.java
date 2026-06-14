package com.itheima.test;

import java.util.Scanner;

public class Test16 {
    public static void main(String[] args) {
        /*
        键盘录入两个数字,表示一个范围
        统计这个范围中,既能被3整除,又能被5整除的数字有多少个
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入第一个数字");
        int num1 = sc.nextInt();
        System.out.println("请录入第二个数字");
        int num2 = sc.nextInt();
        int i = num1<num2? num1:num2;
        int j =num1>num2? num1:num2;
        int sum = 0;
        for(int x=i ;x<=j;x++){
            if(x%3 == 0){
                if(x%5 == 0){
                    sum ++;
                }
            }
        }
        System.out.println(sum);
    }
}
