package com.itheima.listdemo;

import java.util.ArrayList;

public class ArrayListDemo2 {
    static void main(String[] args) {
        //1.创建一个集合
        ArrayList<String> list = new ArrayList<>();

        //2.添加元素 .add()
        list.add("aaa"); //返回值是boolean类型,永远都是true,所以可以不接收
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");

        System.out.println(list);

        //3.删除元素 .remove() 或 .remove(索引)
        list.remove("aaa");
        System.out.println(list);

        String str = list.remove(0);//返回被删除的元素
        System.out.println(str); // bbb
        System.out.println(list);

        //4.修改元素 .set(索引,替换元素)
        String str2 = list.set(0, "eee");//返回被替换的数据
        System.out.println(str2);//ccc
        System.out.println(list);//[eee,ddd]

        //5.查询元素 .get()
        String str3 = list.get(0);
        System.out.println(str3);//eee

//6.集合长度 int size()
        int length = list.size();
        System.out.println(length);

        //7.遍历 list.fori-- 索引是size  ---元素是.get()
        for (int i = 0; i < list.size(); i++) {
            String str4 = list.get(i);
            System.out.println(str4);
        }
    }


    public static class Test1 {
        static void main(String[] args) {
            //遍历集合

            //1.创建集合
            ArrayList<String> list = new ArrayList<>();
            //2.添加元素
            list.add("壹");
            list.add("贰");
            list.add("叁");
            list.add("肆");

            //3.遍历集合
            System.out.print("[");
            for (int i = 0; i < list.size(); i++) {
                if(i==list.size()-1){
                    System.out.print(list.get(i));
                }else{
                    System.out.print(list.get(i) + ", ");
                }

            }
            System.out.println("]");

        }
    }
}
