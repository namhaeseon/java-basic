package com.itheima.a03oppextendsdemo3;

public class Employee {
    //创建Employ--父类,构造方法,变量(工号,姓名,工资),和方法(工作管理其他人,吃饭吃米饭)
    private String id;
    private String name;
    private int salary;

    public Employee() {
    }

    public Employee(String id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void work(){
        System.out.println("管理其他人");
    }

    public void eat(){
        System.out.println("吃米饭");
    }

}
