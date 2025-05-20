package com.liuyue.branch;

import java.util.Scanner;

public class switchDemo3 {
    public static void main(String[] args) {
        testSwitch();

    }

    public static void testSwitch() {
        System.out.println("请输入性别：");
        Scanner sc = new Scanner(System.in);
        String sex = sc.next();
        switch (sex) {
            case "男":
                System.out.println("推荐Java");
                break;
            case "女":
                System.out.println("推荐Python");
                break;
            default:
                System.out.println("没法推荐");
        }

    }
}

