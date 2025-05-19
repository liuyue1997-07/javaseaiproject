package com.itheima.method;

public class methodDemo1 {
    public static void main(String[] args) {
        //目标:掌握方法的定义和调用
        int sum = printSum(1, 2);
        System.out.println("和是:" + sum);

        System.out.println("--------------------------");

        int sum2 = printSum(3, 4);
        System.out.println("和是:" + sum2);
    }

    //定义一个方法,求两个数的和
    public static int printSum(int a, int b) {
        return a + b;
    }
//    void 不用返回
}
