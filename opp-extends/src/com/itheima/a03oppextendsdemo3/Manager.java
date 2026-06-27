package com.itheima.a03oppextendsdemo3;

public class Manager extends Employee {
    //创建manager子类--添加变量管理奖金,构造方法
    private int bonus;

    public Manager() {

    }

    public Manager(String id, String name, int salary, int bonus) {
        super(id, name, salary);
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}
