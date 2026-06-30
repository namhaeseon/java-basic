package com.itheima.a01abstractdemo1;

public class Frog extends Animal {
    public Frog(String name, int age) {
        super(name, age);
    }

    public Frog() {
    }

    @Override
    public void eat() {
        System.out.println(getName() + "在吃虫子");
    }
}
