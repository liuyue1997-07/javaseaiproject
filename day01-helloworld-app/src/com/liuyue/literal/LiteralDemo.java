package com.liuyue.literal;

/**
 * 目标：常见字面量的书写格式。
 */
public class LiteralDemo {
    public static void main(String[] args) {
        printLiteral();
    }

    public static void printLiteral() {
        //请帮我直接输出常见的字面量
        //1.整型字面量
        System.out.println(1);
        //2.浮点型字面量
        System.out.println(1.0);
        //3.布尔型字面量ture/false
        System.out.println(true);
        //字符型自变量，单引号，有且仅有一个字符
        System.out.println('a');
        System.out.println(' ');
        System.out.println('你');
//        System.out.println('你好');//报错
//        System.out.println('');//报错
        //4.字符串字面量
        System.out.println("hello world");
        System.out.println("你好");

        //5.字符型转义字符
        //\t 制表符(算一个字符)(Tab缩进功能)
        System.out.println("hello\tworld");
        //\n 换行符(换行符)
        System.out.println("hello\nworld");

    }

}
