package com.itheima.a02interfacedemo2;

public class Test {
    static void main(String[] args) {
        /*编写带有接口和抽象类的标准Javabean类
        我们现在有乒乓球运动员和篮球运动员,乒乓球教练和篮球教练
        为了出国交流,跟乒乓球相关的人员都需要学习英语
        请用所有知识分析,在这个案例中,哪些是具体类,哪些是抽象类?哪些是接口?

        乒乓球运动员:姓名,年龄,学打乒乓球,说英语
        篮球运动员:姓名,年龄,学打篮球
        乒乓球教练:姓名,年龄,教打乒乓球,说英语
        篮球教练:姓名,年龄,教打篮球
         */

        //1.建父类Person(姓名,年龄)
        //2.建二级父类Athlete(抽象方法学习)
        //3.建二级父类Coach(抽象方法教)
        //4.建接口Speak(方法学英语)
        //5.建子类对象

        BaskertballAthete ba = new BaskertballAthete("乔丹",20);
        System.out.println(ba.getName() + ", " + ba.getAge());
        ba.study();
        System.out.println("===================================");
        BasketbalCoach bc = new BasketbalCoach("统统",45);
        System.out.println(bc.getName() + ", " + bc.getAge());
        bc.teach();
        System.out.println("==================================");
        PingpongAthelete pa = new PingpongAthelete("张亮",16);
        System.out.println(pa.getName() + ", " + pa.getAge());
        pa.study();
        pa.speak();
        System.out.println("=================================");
        PingpongCoach pc = new PingpongCoach("老王",30);
        System.out.println(pc.getName() + ", " + pc.getAge());
        pc.teach();
        pc.speak();
    }
}
