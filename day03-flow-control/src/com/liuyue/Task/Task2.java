package com.liuyue.Task;

import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        guess();
    }

    public static void guess() {
//        int num=(int)(Math.random()*100)+1;

        //产生随机数
        Random r = new Random();
//        int LuckNum = r.nextInt(100) + 1;

        //产生固定范围的随机数
        //  [65,91]
        int LuckNum = r.nextInt(27) + 65;

        //查看随机数
        System.out.println("随机数是：" + LuckNum);

        //获取用户输入的数字
        Scanner sc = new Scanner(System.in);

        //循环检测
        for (int i = 1; ; i++) {
            //提示
            System.out.println("请输入数字：");

            //定义循环内临时输入，方便进行比较
            int num = sc.nextInt();

            //判断
            if (num == LuckNum) {
                System.out.println("第" + i + "次猜对，数字是：" + num);
                break;
            } else if (num > LuckNum) {
                System.out.println("第" + i + "次猜错，数字太大了，请重新猜：");
            } else {
                System.out.println("第" + i + "次猜错，数字太小了，请重新猜：");
            }
        }
    }
}
