package com.liuyue.branch;

public class ifTest2 {
    public static void main(String[] args) {
        testIf();
    }





    public static void testIf() {
        boolean red = false;
        boolean yellow = false;
        boolean green = true;
        if (red) {
            System.out.println("红灯亮");
        } else if (yellow) {
            System.out.println("黄灯亮");
        } else if (green) {
            System.out.println("绿灯亮");
        } else {
            System.out.println("灯故障！");
        }
    }
}
