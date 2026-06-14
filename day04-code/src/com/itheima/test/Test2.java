package com.itheima.test;

public class Test2 {
    public static void main(String[] args) {
        // 自动驾驶
        boolean isLightGreen = false ;
        boolean isLightYellow = false ;
        boolean isLightRed = true ;
        if (isLightGreen){
            System.out.println("GoGOGo!");
        }
        if (isLightYellow){
            System.out.println("WaitWait!");
        }
        if (isLightRed){
            System.out.println("stop!");
        }
    }
}
