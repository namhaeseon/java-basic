package com.itheima.stringdemo;

public class StringDemo12 {
    public static void main(String[] args) {
        //敏感词替换
        //1,获取说的话
        String talk = "你真是, TMD,SB ";
        //2.把里面的敏感词替换为***
        String result = talk.replace("TMD", "***");
        System.out.println(result);

        //定义一个敏感词库
        String [] arr = {"TMD", "CNM", "SB"};
        //循环得到数组中每一个敏感词,一次循环替换
        for (int i = 0; i < arr.length; i++) {
            talk = talk.replace(arr[i], "***");
        }
        System.out.println(talk);
    }
}
