package com.itheima.a02interfacedemo2;

public class BasketbalCoach extends Coach{
    public BasketbalCoach() {
    }

    public BasketbalCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("教打篮球");
    }
}
