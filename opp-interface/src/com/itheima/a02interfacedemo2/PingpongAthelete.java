package com.itheima.a02interfacedemo2;

public class PingpongAthelete extends Athlete implements Speak {
    public PingpongAthelete() {
    }

    public PingpongAthelete(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("学打乒乓球");
    }

    @Override
    public void speak() {
        System.out.println("学英语");
    }
}
