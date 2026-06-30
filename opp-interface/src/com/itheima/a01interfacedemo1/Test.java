package com.itheima.a01interfacedemo1;

public class Test {
    static void main(String[] args) {
        Frog frog = new Frog("青蛙",1);
        System.out.println(frog.getName() + ", " + frog.getAge());
        frog.eat();
        frog.swim();
        Dog dog = new Dog("狗狗",4);
        System.out.println(dog.getName() + ", " + dog.getAge());
        dog.eat();
        dog.swim();
        Rabbit rabbit = new Rabbit("兔兔",2);
        System.out.println(rabbit.getName() + ", " + rabbit.getAge());
        rabbit.eat();


    }
}
