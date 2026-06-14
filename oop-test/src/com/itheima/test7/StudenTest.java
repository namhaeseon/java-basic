package com.itheima.test7;

public class StudenTest {
    public static void main(String[] args) {
        /*定义一个长度为3的数组,数组存储1~3名学生对象作为初始数据,学生对象的学号,姓名各不相同
        学生的属性:学号,姓名,年龄
        要求1:再次添加一个学生对象,并在添加的时候进行学号的唯一性判断
        要求2:添加完毕之后,遍历所有学生信息
        要求3:通过id删除学生信息
             如果存在,则删除,如果不存在,则提示删除失败
        要求4: 删除完毕之后,遍历所有学生信息
        要求5:查询数组id为"heima002"的学生,如果存在,则将他的年龄加1岁
         */
        //创建学生对象(学号,姓名,年龄)
        //定义一个长度为3的数组(学生对象)
        Student[] arr = new Student[3];
        //存储1~3名学生对象作为初始数据
        Student st1 = new Student(001, "张亮", 30);
        Student st2 = new Student(002, "孙杨", 25);
        Student st3 = new Student(003, "邓超", 18);
        arr[0] = st1;
        arr[1] = st2;
        arr[2] = st3;
        //再次创建一个学生对象
        Student st4 = new Student(004, "苏醒", 28);
        //唯一性判断
        boolean flag = contains(st4.getId(), arr);
        if (flag) {
            //已存在,不用添加
            System.out.println("当前id重复,请修改ID后再进行添加");
        } else {
            //不存在,就可以把学生对象添加进数组
            //把st4添加到数组当中
            //1.数组已经存满--- 只能创建一个新的数组,新的数组长度=老数组+1
            //2.数组没有存满---直接添加
            int count = getCount(arr);
            if (count == arr.length) {
                Student[] newArr = creatNewArr(arr);
                newArr[count] = st4;
                //遍历数组
                printArr(newArr);

            } else {
                arr[count] = st4;
                //遍历数组
                printArr(arr);
            }

            //通过id删除学生信息
            //如果存在,则删除,如果不存在,则提示删除失败





        }
    }

    //遍历数组
    public static void printArr(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            Student st = arr[i];
            if (st != null) {
                System.out.println(st.getId() + ", " + st.getName() + ", " + st.getAge());
            }

        }
    }

    //创建一个新的数组,长度=老数组的长度+1
    //然后把老数组的元素拷贝到新数组当中

    public static Student[] creatNewArr(Student[] arr) {
        Student[] newArr = new Student[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }

    //定义一个方法判断数组中已经存了几个元素
    public static int getCount(Student[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                count++;
            }
        }
        return count;
    }

    //对学号唯一性进行判断
    //1.我要干嘛? --将新对象的id和数组对象里的id进行比较
    //2.我干这件事情,需要什么才能完成?--新对象的ID,还有数组对象的.ID
    public static boolean contains(int id, Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            Student st = arr[i];
            if (st != null) {
                int sid = st.getId();
                if (sid == id) {
                    return true;
                }
            }
        }
        return false;
    }
}
