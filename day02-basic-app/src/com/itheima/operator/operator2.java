package com.itheima.operator;

public class operator2 {
    public static void main(String[] args) {
//        printOperator2(10);
        int c = 10;
        int d = 5;
        int rs3=c++ + ++c - --d - ++d + 1 + c--;
        System.out.println(rs3);
        System.out.println(c);
        System.out.println(d);
    }
//    public static void printOperator2(int a) {
//        int a1 = a ++;
//        System.out.println(a1);
//        System.out.println(a);
//        int a2=  ++ a;
//        System.out.println(a2);
//        System.out.println(a);
//    }
    //扩展的赋值运算符隐含了强制运算，a+=b,结果强制转换成a的类型，运算更简单，省转化代码，否则：a=(byte) (a+b);


}
