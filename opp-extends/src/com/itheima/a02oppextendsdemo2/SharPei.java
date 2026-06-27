package com.itheima.a02oppextendsdemo2;

public class SharPei extends Dog {
    //创建SharPei--子类,吃饭方法的重写,吃狗粮,吃骨头
    //1.@Override 方法的重写
    @Override
    public void eat() {
        System.out.println("吃狗粮,吃骨头");
    }
}
