package com.liuyue.helloworld;

public class HelloWorld {
//    main主方法
    public static void main(String[] args) {
        System.out.println("HelloWorld");
        System.out.println("--------------");
        printHelloWorld3();
        System.out.println("--------------");
        printSum(4,2);
    }


    //        打印5行Hello world
    public static void printHelloWorld3() {
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");


    }
//    任意两个整数的和
    public static void printSum(int a,int b){
        int sum = a + b;
        System.out.println(sum);
    }
}