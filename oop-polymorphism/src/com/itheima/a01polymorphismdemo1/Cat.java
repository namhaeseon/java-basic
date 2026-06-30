package com.itheima.a01polymorphismdemo1;

public class Cat extends Pet{
    public Cat() {
    }

    public Cat(int age, String color) {
        super(age, color);
    }

    public void catchMouse(){
        System.out.println("猫猫在逮老鼠");
    }

    @Override
    public void eat(String something) {
        System.out.println(getAge() + "的"+ getColor() +
                "颜色的猫眯着眼睛侧着头吃" + something );
    }
}
