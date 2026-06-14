package com.itheima.infiniteloop.test;

import java.sql.SQLOutput;
import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        Random r = new Random();
        int a = r.nextInt(100)+1;
        System.out.println(a);
        int number = 1;
        while (true){
            if(number==a){
                break;
            }
            number++;
        }
        System.out.println(number);
    }

}
