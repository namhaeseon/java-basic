package com.itheima.a01abstractdemo1;

public class Dog extends Animal{
    public Dog(String name, int age) {
        super(name, age);
    }

    public Dog() {
    }

    @Override
    public void eat() {
        System.out.println(getName() + "在吃骨头");
    }
}
