package com.itheima.a02interfacedemo2;

public abstract class Athlete extends Person {
    //2.建二级父类Athlete(抽象方法学习)
    public Athlete() {
    }

    public Athlete(String name, int age) {
        super(name, age);
    }

    public abstract void study();
}
