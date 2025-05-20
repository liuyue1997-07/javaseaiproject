package com.liuyue.loop;

import java.util.Scanner;

public class forTesk1 {
    public static void main(String[] args) {
//        System.out.println("全数位数：");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        System.out.println("和是：" + sum(n));
//        System.out.println("奇数和是：" + sum2(n));
//        System.out.println("奇数和是：" + sum3(n));

        System.out.println("水仙花：");
        Scanner sc1 = new Scanner(System.in);
        int m = sc1.nextInt();
        System.out.println("水仙花：" + narcissus(m));
    }


    //输入三位数判断并输出水仙花数
    public static int narcissus(int m) {
        int count1 = 0;
        for (int i = 100; i < m; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100;
            if (ge * ge * ge + shi * shi * shi + bai * bai * bai == i) {
                System.out.println(i);
                count1++;
            }
        }
        return count1;
    }

//    public static int sum(int n) {
//        int sum = 0;
//        for (int i = 1; i <= n; i++) {
//            sum += i;
//
//        }
//        return sum;
//    }
//
//    //奇数和
//    public static int sum2(int n) {
//        int sum = 0;
//        for (int i = 1; i <= n; i++) {
//            if (i % 2 == 1) {
//                sum += i;
////                System.out.println(i);
//            }
////            System.out.println(i);
//
//        }
//        return sum;
//    }
//
//    //奇数和
//    public static int sum3(int n) {
//        int sum = 0;
//        for (int i = 1; i <= n; i += 2) {
//            sum += i;
////            System.out.println(i);
//        }
//        return sum;
//    }


}

