package com.dima;

public class Main {

    public static void main(String[] args) {
        //new Main().entryPoint(args);

        new Task1().resolve(0, 0, 0);
    }

    public void entryPoint(String[] args) {
        System.out.println("Hello World");

        int i = 0;
        long l = 0;


        double d = 0d;

        float f = 9.4f;

        boolean b = true;

        char c = 'r';

        byte bb = 100;


//        for (int j = 0; j < 5; j += 2) {
//             System.out.println(">>> j: " + j);
//        }
//        System.out.println("=========");
//        int y = 0;

//        do {
//            if (y % 2 == 0) {
//                System.out.println(">>> " + y);
//            }
//            y++;
//        } while (y < 50);


//        switch (y) {
//            case 1:
//                printString2("1");
//                break;
//
//            case 2:
//                printString2("2");
//                break;
//
//            default:
//
//        }
        int sum = sum(2, 6);
        System.out.println(">>> sum : " + sum);


    }

    public void printString2(String s) {
        System.out.println(">>> " + s);
    }

    int sum(int a, int b) {
        return a + b;
    }
}
