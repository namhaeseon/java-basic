package com.itheima.a01oppextendsdemo1;

public class Test {
    static void main(String[] args) {
        Ragdoll rd = new Ragdoll();
        rd.eat();
        rd.drink();
        rd.catchMouse();
        System.out.println("-------------------");

        Husky h = new Husky();
        h.eat();
        h.drink();
        h.lookHome();
        h.breakHome();

    }
}
