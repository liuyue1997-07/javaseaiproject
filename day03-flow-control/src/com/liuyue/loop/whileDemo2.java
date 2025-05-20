package com.liuyue.loop;

public class whileDemo2 {
    public static void main(String[] args) {
//        System.out.println("经过" + testWhile() + "年后，本金翻倍");

        System.out.println("折叠了" + testWhile() + "次，可以折叠珠穆朗玛峰");
    }

    //假设你在银行投资了100000元，银行给出的复利是1.7%，问多少年后能实现本金翻倍
//    public static int testWhile() {
//        double money = 100000;
//        int year = 0;
////        for  (; money < 200000; ) {
//        while (money < 200000) {
//            money = money * 1.017;
//            year++;
//        }
////        System.out.println("经过" + year + "年后，本金翻倍");
//        return year;
//    }

//    需求:世界最高山峰珠穆朗玛峰高度是:8848.86米=8848860毫米，假如我有一张足够大的纸，它的厚度是0.1毫米。请问:该纸张折叠多少次，可以折成珠穆朗玛峰的高度?
    public static int testWhile() {
//        double paper = 0.1;
//        int count = 0;
//        while (paper < 8848860) {
//            paper = paper * 2;
//            count++;
//        }
//        return count;


        double paper = 0.1;
        int count = 0;
        while (paper < 8848860) {
            paper = paper * 2;
            count++;
        }
        return count;
    }

}
