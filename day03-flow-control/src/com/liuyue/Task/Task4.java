package com.liuyue.Task;

public class Task4 {
    public static void main(String[] args) {
    //素数

        int  count = 0;
        System.out.println("素数：");
        for (int i = 100; i <= 200; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("素数的个数：" + count);
    }

    //素数
    public static boolean isPrime(int n) {

        for (int i = 2; i <=  (int) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
