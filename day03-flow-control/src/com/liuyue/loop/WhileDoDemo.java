package com.liuyue.loop;

public class WhileDoDemo {
    public static void main(String[] args) {
        testDoWhile();
    }


    //do while循环
    public static void testDoWhile() {
        int i = 1;
        do {
            System.out.println("i=" + i);
            i++;
        } while (i <= 3);
    }
}
