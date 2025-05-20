package com.liuyue.branch;

import java.util.Scanner;

public class switchDemo4 {
    public static void main(String[] args) {
        testSwitch();

    }

    public static void testSwitch() {
        System.out.println("请输入月份：");
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31天");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30天");
                break;
            case 2:
                System.out.println("28天");
                break;
            default:
                System.out.println("输入的月份有误");
        }
    }
}
