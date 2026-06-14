package com.itheima.methoddemo;

public class MethodDemo5 {
    public static void main(String [] args){
        //定义一个方法,求一家商场每个季度的营业额
        //根据方法结果再计算出全年营业额
        double firstSeason = seasonRevenue(300,678,78.9);
        double secondSeason = seasonRevenue(567,6567,78.9);
        double thirdSeason = seasonRevenue(567,6567,78.9);
        double forthSeason = seasonRevenue(567,6567,78.9);
        double revenue = firstSeason + secondSeason + thirdSeason + forthSeason;
        System.out.println(revenue);


    }
    public static double seasonRevenue(double a, double b, double c){
        double result = a + b + c;
        return result;
    }
}
