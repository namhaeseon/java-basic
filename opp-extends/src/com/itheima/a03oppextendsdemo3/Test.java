package com.itheima.a03oppextendsdemo3;

public class Test {
    static void main(String[] args) {
        //带有继承结构的标准Javabean类
        /*
        1.经理:成员变量: 工号,姓名,工资,管理奖金
              成员方法:工作(管理其他人),吃饭(吃米饭)
        2.厨师:成员变量:工号,姓名,工资
        成员方法:工作(炒菜),吃饭(吃米饭)
         */
        //1.创建Employ--父类,构造方法,变量(工号,姓名,工资),和方法(工作管理其他人,吃饭吃米饭)---完成
        //2.创建manager子类--添加变量管理奖金,构造方法
        //3.创建cooker子类--方法重写(炒菜)
        Manager m1 = new Manager("001", "张三", 5000, 3000);
        System.out.println(m1.getId() + ", " + m1.getName() + ", " + m1.getSalary()
                + ", " + m1.getBonus());
        m1.eat();
        m1.work();
        System.out.println("==========================================");
        Cooker c1 = new Cooker();
        c1.setId("002");
        c1.setName("李四");
        c1.setSalary(5000);
        System.out.println(c1.getId() + ", " + c1.getName() + ", " + c1.getSalary());
        c1.eat();
        c1.work();


    }
}
