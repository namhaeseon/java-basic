package com.itheima.a01polymorphismdemo1;

public class Dog extends Pet{
    public Dog() {
    }

    public Dog(int age, String color) {
        super(age, color);
    }


    public void lookHome(){
    System.out.println("狗狗在看家");
}

    @Override
    public void eat(String something) {
        System.out.println(getAge() + "的"+ getColor() +
                "颜色的狗两只前腿死死的抱住" + something + "猛吃");
    }
}
