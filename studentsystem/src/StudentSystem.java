import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {
    static void main(String[] args) {
        //0.创建学生类: id, 姓名, 年龄, 家庭住址
        //需要一个容器来存储学生对象数据---ArrayList
        ArrayList<Student> list = new ArrayList<>();
        //1.打印初始菜单界面
        loop: while (true) {
            System.out.println("------------------欢迎来到黑马学生管理系统--------------------");
            System.out.println("1：添加学生");
            System.out.println("2：删除学生");
            System.out.println("3：修改学生");
            System.out.println("4：查询学生");
            System.out.println("5：退出");
            System.out.println("请输入您的选择:");
            //2.收取键盘录入信息,并进行配对进入相应程序
            Scanner sc = new Scanner(System.in);
            String choose = sc.next();
            switch (choose) {
                case "1" -> addStudent(list);
                case "2" -> deleteStudent(list);
                case "3" -> updateStudent(list);
                case "4" -> queryStudent(list);
                case "5" -> {
                    System.out.println("退出");
                    break loop;}//当循环嵌套时,想要退出某个循环,可以在循环前起个名字:,再break+名字退出循环
                //或者 System.exit(status:0);--停止虚拟机运行(比如点右上角X的时候可用)
                default -> System.out.println("输入有误,请重新输入");
            }
            //3.定义方法
        }


    }

    public static void addStudent(ArrayList<Student> list) {
        Student stu = new Student();
        Scanner sc = null;
        while (true) {
            System.out.println("请输入学生的id");
            sc = new Scanner(System.in);
            String id = sc.next();
            if(contains(list,id)){
                System.out.println("学生id已存在,请重新输入id");
            }else{
                stu.setId(id);
                break;
            }
        }
        System.out.println("请输入学生的姓名");
        String name = sc.next();
        stu.setName(name);
        System.out.println("请输入学生的年龄");
        int age = sc.nextInt();
        stu.setAge(age);
        System.out.println("请输入学生的地址" );
        String address = sc.next();
       stu.setAddress(address);
        list.add(stu);
        //提示用户添加成功
        System.out.println("学生信息添加成功");

    }

    public static void deleteStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的学生id");
        String id = sc.next();
        int index = getIndex(list,id);
        if(index>=0){
            list.remove(index);
            System.out.println("id为" + id +"学生删除成功");
        }else{
            System.out.println("id不存在,删除失败");
        }

    }

    public static void updateStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改的学生id");
        String id = sc.next();
        int index = getIndex(list,id);
        if(index== -1){
            System.out.println("要修改的学生id"+ id +"不存在");
            return;
        }
        System.out.println("请输入要修改的学生姓名");
        String newName = sc.next();
        list.get(index).setName(newName);
        System.out.println("请输入要修改的学生年龄");
        int newAge = sc.nextInt();
        list.get(index).setAge(newAge);
        System.out.println("请输入要修改的学生地址");
        String newAddress = sc.next();
        list.get(index).setAddress(newAddress);
    }

    public static void queryStudent(ArrayList<Student> list) {
       if(list.size()==0){
           System.out.println("当前无学生信息，请添加后再查询");
           return;
       }
        System.out.println("id\t\t姓名\t\t年龄\t\t家庭地址");
        for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i).getId()+"\t\t"+list.get(i).getName()+
                        "\t\t"+list.get(i).getAge()+"\t\t"+list.get(i).getAddress());
        }
    }

public static boolean contains(ArrayList<Student> list, String id) {
    /*for (int i = 0; i < list.size(); i++) {
        if(list.get(i).getId().equals(id)){
            return true;
        }
    }
      return  false;
     */
    return getIndex(list,id)>=0;
}

public static int getIndex(ArrayList<Student> list, String id){
    for (int i = 0; i < list.size(); i++) {
        //遍历集合查看id是否存在
        if(list.get(i).getId().equals(id)){
            //存在返回对应索引
            return i;
        }
    }
    //循环结束不存在,返回-1
    return -1;

}


}
