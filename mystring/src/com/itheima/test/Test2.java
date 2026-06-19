package com.itheima.test;

public class Test2 {
    static void main(String[] args) {
        //调整字符串
        /*给定两个字符串,A和B
        A的旋转操作就是将A最左边的字符移动到最右边
        例如,若A='abcde',在移动一次之后结果就是'bcdea'
        入过在若干次调整操作之后,A能变成B,那么返回True,如果不能匹配成功,则返回false*/
        //1.定义两个字符串
        String strA = "abcde";
        String strB = "cdeab";

        //2.定义方法将A进行旋转操作
        //3.定义方法将A和B比较
        boolean result = check(strA, strB);
        System.out.println(result);
    }

    //3.定义方法对A和B进行比较校验
    public static boolean check(String strA, String strB) {
        for (int i = 0; i < strA.length(); i++) {
            strA = rotate(strA);
            if (strA.equals(strB)) {
                return true;
            }
        }
        return false;
    }


    //2.旋转方法---两种方法 截取或数组
    //1.用substring进行截取,将左侧的字符截取出来拼接到右侧
    public static String rotate(String str) {
        char start = str.charAt(0);
        String end = str.substring(1);
        return end + start;
    }

    //方法2--数组
    //可以把字符串先变成一个字符数组,然后调整字符数组里面的数据,最后再把字符数组变成字符
    /*public static String rotate2(String str) {
        char[] arr = str.toCharArray();
//拿到0索引的字符
        char first = arr[0];
//把剩下的字符依次往前顺移一个位置
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = first;
        //利用字符数组创建一个字符串对象
        String result = new String(arr);
        return result;
    }*/

}
