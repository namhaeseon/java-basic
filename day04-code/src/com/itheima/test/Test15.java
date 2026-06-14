package com.itheima.test;

public class Test15 {
    public static void main(String[] args) {
        int j = 0;
        for(int i=1; i<101; i++){
            if(i%2==0){
                j += i;
            }
        }
        System.out.println(j);
    }
}
