package com.liuyue.Task;

import java.util.Scanner;
//输出验证码
public class Task3 {
    public static void main(String[] args) {

        getCode();
//        System.out.println(getCode());
    }

    //开发一个程序，可以生成指定位数的验证码，每位可以是数字、大小写字母
    public static void getCode() {

        //无限循环
        while (true) {

        //用户输入位数
        System.out.println("请输入位数：");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num < 1 || num > 6) {
            System.out.println("位数不合法");
        }

            //空间
            String code = "";
            //随机类型
            for (int i = 0; i < num; i++) {

                //【0-3）
                int type = (int) (Math.random() * 3);
                switch (type) {
                    case 0:
                        code += (char) ((int) (Math.random() * 26) + 'a');
                        break;

                    case 1:
                        code += (char) ((int) (Math.random() * 26) + 'A');
                        break;

                    case 2:
                        code += (int) (Math.random() * 10);
                        break;
                }

            }
            System.out.println(code);
        }
    }



}

