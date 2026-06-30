package com.itheima.a01polymorphismdemo1;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

/*    //年龄为30岁的老王养了一只黑颜色的2岁的狗
//2岁的黑颜色的狗两只前腿死死的抱住骨头猛吃
    public void keepPet(Dog dog, String something) {
        System.out.println("年龄为" + age + "的" + name + "养了一只"
                + dog.getColor() + "颜色的" + dog.getAge() + "的狗");
        dog.eat(something);

    }
    //年龄为25岁的老李养了一只灰颜色的3岁的猫
    //3岁的灰颜色的猫眯着眼睛侧着头吃鱼

    public void keepPet(Cat cat, String something) {
        System.out.println("年龄为" + age + "的" + name + "养了一只"
                + cat.getColor() + "颜色的" + cat.getAge() + "的猫");
        cat.eat(something);
    }*/

    //多态的应用
    public void keepPet(Pet p, String something) {
        if(p instanceof Dog dog){
            System.out.println("年龄为" + age + "的" + name + "养了一只"
                    + dog.getColor() + "颜色的" + dog.getAge() + "的狗");
            dog.eat(something);
        }else if(p instanceof Cat cat){
            System.out.println("年龄为" + age + "的" + name + "养了一只"
                    + cat.getColor() + "颜色的" + cat.getAge() + "的猫");
            cat.eat(something);
        } else{
            System.out.println("没有这个动物");}
    }



}
