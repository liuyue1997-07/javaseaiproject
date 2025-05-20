package com.liuyue.branch;

import java.util.Scanner;

public class ifDemo1 {
    public static void main(String[] args) {
//        此处只调用，方法独立写
        testIf();
        testIf2();
        testIf3();
    }

    //if语句
    public static void testIf() {
        int age = 19;
        if (age > 18) {
            System.out.println("可以投票");
        } else System.out.println("年龄不够");
    }

    public static void testIf2() {
        int money = 100;
        if (money > 500) {
            System.out.println("可以购买商品");
        } else {
            System.out.println("钱不够");
        }
    }

    public static void testIf3() {
        System.out.println("请输入成绩");
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        if (score >= 90 &&  score <= 100) {
            System.out.println("优秀");
        } else if (score >= 80&& score < 90) {
            System.out.println("良好");
        } else if (score >= 70&& score < 80) {
            System.out.println("中等");
        } else if  (score >= 60&& score < 70){
            System.out.println("及格");
        } else if (score >= 0&& score < 60){
            System.out.println("不及格");
        } else {
            System.out.println("输入的分数有误");
        }
    }

}
