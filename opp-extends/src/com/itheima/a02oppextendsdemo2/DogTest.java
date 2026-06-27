package com.itheima.a02oppextendsdemo2;

public class DogTest {
    static void main(String[] args) {
        //利用方法的重写设计继承结构
        /*现在有三种动物:哈士奇,沙皮狗,中华田园犬
        暂时不考虑属性,只要考虑行为
        请按照继承的思想特点进行继承体系的设计
        三种动物分别有以下的行为:
        哈士奇: 吃饭(吃狗粮),喝水,看家,拆家
        沙皮狗 吃饭(吃狗粮,吃骨头),喝水,看家
        中华田园犬 吃饭(吃剩饭) 喝水  看家
         */
       //1.创建狗Dog--父类,定义吃饭,喝水,看家的行为====完成
        //2.创建Husky--子类 , 吃饭方法的重写,再定义一个行为--拆家====完成
        //3.创建SharPei--子类,吃饭方法的重写====完成
        //4.创建ChinseDog--子类,吃饭方法的重写(吃剩饭)====完成
        Husky h = new Husky();
        h.eat();
        h.drink();
        h.lookHome();
        h.behavior();
        System.out.println("====================================");

        SharPei sp = new SharPei();
        sp.eat();
        sp.drink();
        sp.lookHome();
        System.out.println("====================================");

        ChineseDog cd = new ChineseDog();
        cd.eat();
        cd.drink();
        cd.lookHome();

    }
}
