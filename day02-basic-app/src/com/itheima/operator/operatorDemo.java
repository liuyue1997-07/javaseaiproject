package com.itheima.operator;

public class operatorDemo {
    public static void main(String[] args) {
        printOperator(10, 3);
        printOperator2();
    }
    public static void printOperator(int a, int b) {
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println((double) a / b);
        System.out.println(1.0 * a / b);
        System.out.println(a % b);

    }
    //需求：研究+符号做运算符还是连接符(能算就算，不能算就合并)
    public static void printOperator2() {
        int a = 5;
        System.out.println(1 + 2);//
        System.out.println("abc" + "a");//abca
        System.out.println("1" + 2);//12
        System.out.println(1 + "2");//12
        System.out.println(a + "a");//5a

    }
}
