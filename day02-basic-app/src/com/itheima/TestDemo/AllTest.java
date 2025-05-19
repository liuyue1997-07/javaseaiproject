package com.itheima.TestDemo;

import java.util.Scanner;

public class AllTest {
    public static void main(String[] args) {
        //目标：完成健康计算器
        Scanner sc = new Scanner(System.in);//扫描器
        //1.先让用户输入:身高,体重,性别,年龄
        System.out.println("请输入身高(cm):");
        double height = sc.nextDouble();
        System.out.println("请输入体重(kg):");
        double weight = sc.nextDouble();
        System.out.println("请输入性别(1:男,2:女):");
        String gender = sc.next();
        System.out.println("请输入年龄:");
        int age = sc.nextInt();
        //2.计算BMI并输出
        double bmi = calcBMI(height, weight);
        System.out.println("BMI:" + bmi);
        //判断是否过重,过重输出提示
        if (bmi > 25) {
            System.out.println("过重!");
        }
        //3.输出BMR并输出
        double bmr = calcBMR(height, weight, age, gender);
        System.out.println("BMR:" + bmr);
        //判断
        if (bmr > 2000) {
            System.out.println("减少运动");
        }else {
            System.out.println("请加强运动!");
        }
    }
//    计算BMI
    public static double calcBMI(double height, double weight) {
        return weight / (height / 100 * height / 100);
//        System.out.println("BMI:" + );
//        return bmi;
    }
    //计算BMR的方法
    public static double calcBMR(double height, double weight, int age, String gender) {
        if ("男".equals(gender)) {
            return 66 + 13.7 * weight + 5 * height - 6.8 * age;
        } else {
            return 655 + 9.6 * weight + 1.8 * height - 4.7 * age;
        }
    }
}

