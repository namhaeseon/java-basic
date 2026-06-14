package com.itheima.test6;

public class GirlFriendTest {
    public static void main(String[] args) {
        /*定义数组存储4个女朋友的对象
        女朋友的属性:姓名,年龄,性别,爱好
        要求1:计算出四女朋友的平均年龄
        要求2:统计年龄比平均值低的女朋友有几个?并把她们的所有信息打印出来
         */
        GirlFriend [] arr = new GirlFriend[4];
        GirlFriend gf1 = new GirlFriend("花花",23,'女',"睡觉");
        GirlFriend gf2 = new GirlFriend("凉凉",32,'女',"弹钢琴");
        GirlFriend gf3 = new GirlFriend("欣欣",18,'女',"游泳");
        GirlFriend gf4 = new GirlFriend("美丽",20,'女',"唱歌");
        arr[0] = gf1;
        arr[1] = gf2;
        arr[2] = gf3;
        arr[3] = gf4;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            GirlFriend gf = arr[i];
            sum += gf.getAge();
        }
        double avgAge = sum / arr.length;
        System.out.println("四位女朋友的平均年龄为:" + avgAge);
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            GirlFriend gf = arr[i];
            if(gf.getAge() < avgAge){
                System.out.println("姓名: " +gf.getName() + ", 年龄: "+ gf.getAge() +
                        ", 性别: " + gf.getGender() +", 爱好: "+ gf.getHobby());
                temp++;
            }

        }
        System.out.println("年龄比平均值低的女朋友有" +temp + "个");
    }
}
