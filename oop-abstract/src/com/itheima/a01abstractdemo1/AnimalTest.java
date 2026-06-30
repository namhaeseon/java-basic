package com.itheima.a01abstractdemo1;

public class AnimalTest {

    public static void main(String[] args) {
        /*
    青蛙: 名字,年龄 喝水,吃虫子
    狗: 名字,年龄,喝水,吃骨头
    羊:名字,年龄,喝水,吃草
     */
        Frog frog = new Frog("青蛙",5);
        frog.drink();
        frog.eat();
        Dog dog = new Dog("狗狗",7);
        dog.drink();
        dog.eat();

        Sheep sheep = new Sheep("小羊",12);
        sheep.drink();
        sheep.eat();

    }


}
