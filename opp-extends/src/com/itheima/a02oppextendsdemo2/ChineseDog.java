package com.itheima.a02oppextendsdemo2;

public class ChineseDog extends Dog{
    //创建ChinseDog--子类,吃饭方法的重写(吃剩饭)
    //1.Override 方法的重写
    @Override
    public void eat(){
        System.out.println("吃剩饭");
    }
}
