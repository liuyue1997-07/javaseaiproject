package com.liuyue.Task;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. 输入第一个数字");
        double a = sc.nextInt();

        System.out.println("2. 输入第二个数字");
        double b = sc.nextInt();

        System.out.println("3. 输入运算符");
        String c = sc.next();

        double result = test1(a, b,c);
        System.out.println("结果为：" + result);
    }

    //+-*/
    public static double test1( double a, double b, String c) {
        double result = 0;
        switch (c) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
            default:
                System.out.println("输入错误");
                break;
        }
        return result;
    }

}
