package com.dima;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Hello World");


        int i = 0;
        long l = 0;


        double d = 0d;

        float f = 9.4f;

        boolean b = true;

        char c = 'r';

        byte bb = 100;


        for (int j = 0; j < 5; j += 2) {
            System.out.println(">>> j: " + j);
        }
        System.out.println("=========");
        int y = 0;

        do {
            if (y % 2 == 0) {
                System.out.println(">>> " + y);
            }
            y++;
        } while (y < 50);


        switch (y) {
            case 1:
                System.out.println(">>> 1");
                break;

            case 2:
                System.out.println(">>> 2");
                break;

            default:

        }


    }
}
