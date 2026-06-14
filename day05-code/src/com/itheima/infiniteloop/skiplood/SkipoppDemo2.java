package com.itheima.infiniteloop.skiplood;

public class SkipoppDemo2 {
    public static void main(String[]args){
        //2.结束整个循环
        for(int i=1; i<=5; i++){
            if(i==4){
                break;
            }
            System.out.println("小老虎在吃第"+i+"个包子");
        }

    }
}
