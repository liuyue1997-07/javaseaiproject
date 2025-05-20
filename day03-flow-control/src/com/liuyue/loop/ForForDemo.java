package com.liuyue.loop;

public class ForForDemo {
    public static void main(String[] args) {
        testFor();
        testFor2();
    }

    public static void testFor() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "x" + i + "=" + (i * j) + "\t");
            }
            System.out.println();
        }
    }
    public static void testFor2() {
        for (int i = 1; i <= 3; i++) {
            for(int j = 1; j <= 5; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
