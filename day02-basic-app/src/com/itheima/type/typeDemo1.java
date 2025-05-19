package com.itheima.type;

import java.util.Scanner;

public class typeDemo1 {
    public static void main(String[] args) {
        //认识自动类型转换,强制类型转换
        //类型 变量 2 = (类型) 变量1;强转可能数据溢出int m=1400;byte n = (byte) m;
        //大专小保留最后有效位数
        //浮点强行转整数,舍弃小数.

printUserInfo();

    }



    //byte、short、char（运算时直接当int运算）。。。。int、long、float、double
    //最高类型运算



public static void printUserInfo(){
    Scanner sc = new Scanner(System.in);
    System.out.println("请输入用户名：");
    String username = sc.next();
    System.out.println("请输入年龄：");
    String age = sc.next();
    System.out.println("您的用户名是："+username+"年龄是："+age);
}






}
