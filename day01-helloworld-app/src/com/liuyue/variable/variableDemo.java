package com.liuyue.variable;

public class variableDemo {
    public static void main(String[] args) {
        //目标：认识变量
        printVariable();

    }

    //定义一个方法,来学习变量
    public static void printVariable() {

        //变量:内存中的一块区域,有格式要求,类型(int整性 double小数 ) 变量名 =  值;
        //定义变量：数据类型 变量名称 = 值;
        int age = 18;
        System.out.println(age);
        //定义一个小数，存储一个值
        double score = 98.6;
        System.out.println(score);
        System.out.println("--------------");
        //为什么用变量记住数据？提高代码的灵活性和维护性
        int number = 10;
        System.out.println(number);
        System.out.println(number);
        System.out.println("18");
        System.out.println("18");
        System.out.println("--------------");
//研究变量里的特点变量里的数据是可以被替换的
        int age2 = 18;
        age2 = 19;
        System.out.println(age2);
        age2 = age2 + 1;
        System.out.println(age2);
        System.out.println("--------------");
//需求微信钱包目前有9块9，发出去5元，收到6元，请写出钱包实时金额。
        double money = 9.9;
        System.out.println(money);
        money = money - 5;
        System.out.println(money);
        money = money + 6;
        System.out.println(money);
//变量是内存空间。存储数据，并且数据可以改变。
//用变量编写代码灵活、管理方便。变量可以被随时替换。
        System.out.println("--------------");
//        其实我计算机中的。
        char char1 = 'A';
        System.out.println(char1 + 1);
        char char2 = 'a';
        System.out.println(char2 + 1);
//photo and audio all Byte 存储
//        图片rgb数字存储，音频坐标轴数据存储
//数字转二进制，用8421
        int i1=0b01100001;//二进制0b开头
        System.out.println(i1);
        int i2=02345;//八进制，0开头
        System.out.println(i2);
        int i3=0xfa;//十六进制，0x开头
        System.out.println(i3);
        System.out.println("--------------");
System.out.println(0b11111111111111111111111111111111);


    }
}
