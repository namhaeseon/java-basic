package com.itheima.a02oppextendsdemo2;

public class Husky extends Dog {
    //创建Husky--子类 , 吃饭方法的重写(吃狗粮),再定义一个行为--拆家

    //1.方法的重写,@Override 注解
    @Override
    public void eat(){
        System.out.println("吃狗粮");
    }
    //2.定义一个方法描述拆家的行为
    public void behavior(){
        System.out.println("拆家");
    }

}
