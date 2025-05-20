package com.liuyue.loop;

public class DeadLoopDemo {
    public static void main(String[] args) {
//        testFor();
//        testWhile();
        testDoWhile();
        //服务器端程序，死循环，会一直运行，不会停止，相应用户数据请求，直到服务器重启
    }

    //for循环死循环
//    public static void testFor() {
//        for (int i = 0; ; i++) {
//            System.out.println(i);
//        }
//    }


    //while循环死循环
    public static void testWhile() {
        int i = 0;
        while (true) {
            System.out.println(i);
            i++;
        }
    }
    //do...while循环死循环
    public static void testDoWhile() {
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (true);
    }
}
