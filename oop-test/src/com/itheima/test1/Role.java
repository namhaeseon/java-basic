package com.itheima.test1;

import java.util.Random;

public class Role {
    //文字版格斗游戏
    private String name;
    private int blood;

    public Role() {
    }

    public Role(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    //定义一个方法用于攻击别人
    //思考: 谁攻击谁?
    //乔峰举起拳头打了鸠摩智一下,造成了XX点伤害,鸠摩智还剩下XX点血
    //乔峰 K.O.了鸠摩智
    //Role r1 = new Role();
    //Role r2 = new Role();

    public void attack(Role role){
        Random r = new Random();
        int hurt = r.nextInt(20)+1;
        int remainblood = role.getBlood()-hurt;
        remainblood = remainblood<0?0:remainblood;
        role.setBlood(remainblood);
        System.out.println(this.getName() +"举起拳头打了" + role.getName()+ "一下,造成了"  +
                        hurt + "点伤害," + role.getName() +"还剩下"+remainblood+"点血");

    }
}
