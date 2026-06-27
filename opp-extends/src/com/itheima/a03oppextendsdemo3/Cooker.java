package com.itheima.a03oppextendsdemo3;

public class Cooker extends Employee {
    //创建cooker子类--方法重写(炒菜)
    public Cooker(){
    }

    public Cooker(String id, String name, int salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("炒菜");
    }
}
