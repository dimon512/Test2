package com.dima;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {

    // написать функцию решения квадратного уравнения
    // ax^2 + bx + c = 0

    public void resolve(double a, double b, double c) {

        while (true) {
            try {

                Scanner userInput = new Scanner(System.in);

                System.out.print("Enter value for a: ");
                a = userInput.nextDouble();
                System.out.println(a);

                System.out.print("Enter value for b: ");
                b = userInput.nextDouble();
                System.out.println(b);

                System.out.print("Enter value for c: ");
                c = userInput.nextDouble();
                System.out.println(c + "\n");

                break;

            } catch (InputMismatchException e) {
                System.out.println("ONLY NUMBERS ALLOWED! Try again \n");
            }
        }

        double D = b * b - 4 * a * c;
        System.out.println("Diskriminant = " + D);

        if (D > 0) {
            double x1 = (-b + Math.sqrt(D)) / 2 * a;
            double x2 = (-b - Math.sqrt(D)) / 2 * a;
            System.out.println("X1 = " + x1);
            System.out.println("X2 = " + x2);
        } else if (D == 0) {
            double x = -b / 2 * a;
            System.out.println("X = " + x);
        } else {
            System.out.println("Diskriminant < 0. Equation can't be solved");
        }


    }


}
