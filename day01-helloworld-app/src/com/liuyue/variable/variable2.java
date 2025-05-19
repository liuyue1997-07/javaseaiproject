package com.liuyue.variable;

public class variable2 {
    public static void main(String[] args) {
        //8种数据类型定义变量
        printVariable();
    }

//    请帮我设计一个方法，打印出8种基本数据类型定义的变量。
    public static void printVariable(){
        //定义变量
        byte a = 10;
        short b = 20;
        int c = 30;
        long d = 40;
        float e = 50.5f;
        double f = 60.6;
        char g = 'a';
        boolean h = true;
        String  i = "hello world";
        //打印变量
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);
    }
}
