package com.itheima.stringdemo;

public class StringDemo11 {
    public static void main(String[] args) {
        //身份证信息查看
        /*人物信息为:
          出生年月日: XXXX年X月X日
          性别为:男/女
         */
        //1.输入身份证号码
        String id = "220523199501163224";
        //2.截取年份
        String year = id.substring(6, 10);
        //3.截取月份
        String month = id.substring(10, 12);
        //4.截取日期
        String day = id.substring(12, 14);
        System.out.println("出生年月日: " + year + "年" + month + "月" +day + "日");
        //5.提取性别
        char genderNum = id.charAt(16);
        //6.将性别字符转换为int
        int gendernum = genderNum - 48;
        //7.对性别进行判断
        if(gendernum % 2 == 0){
            System.out.println("性别为: 女" );
        }else{
            System.out.println("性别为: 男" );
        }
        //8.输出语句


    }
}
