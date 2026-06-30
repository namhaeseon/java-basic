package com.itheima.a02interfacedemo2;

public class BaskertballAthete extends Athlete{
    public BaskertballAthete() {
    }

    public BaskertballAthete(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("学打篮球");
    }
}
