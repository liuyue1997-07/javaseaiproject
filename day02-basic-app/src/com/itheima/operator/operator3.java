package com.itheima.operator;

public class operator3 {
    public static void main(String[] args) {
        printTernaryOperator(10, 5);
        printIsPass(60);
        printMax(10, 5, 8);
    }
    //需求：三元运算符
    public static void printTernaryOperator(int a, int b) {
        int c = a > b ? a : b;
        System.out.println(c);
    }
    //需求：判断挂科
    public static void printIsPass(int score) {
        String result = score >= 60 ? "通过" : "挂科";
        System.out.println(result);
    }
    //需求：判断三个较大值
    public static void printMax(int a, int b, int c) {
//        int max=a>b?(a>c?a:c):(b>c?b:c);//括号可以取消
        int max = a > b ? a : b;
        max = max > c ? max : c;
        System.out.println(max);

    }
    //& | ! ^
    //&&短路与 ||短路或
}
