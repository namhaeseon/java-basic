package com.itheima.a02interfacedemo2;

public class PingpongCoach extends Coach implements Speak{
    public PingpongCoach() {
    }

    public PingpongCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("教打乒乓球");
    }

    @Override
    public void speak() {
        System.out.println("学英语");
    }
}
