package com.epam.java_web_development.main;

import java.util.Scanner;

public class Main5 {
    public static double inputDoubleFromConsole(String str) {
        double value;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input " + str + ": ");
        while (!sc.hasNextDouble()) {
            sc.nextLine();
            System.out.println("Wrong input. Input is not a number. Please, try again.");
            System.out.print("Input " + str + ": ");
        }
        value = sc.nextDouble();
        return value;
    }

    public static double elevate (double i) {
        if (i >= 0) {
            return Math.pow(i, 2);
        } else {
            return Math.pow(i, 4);
        }
    }

    public static void main(String[] args) {
        double a, b, c;

        a = inputDoubleFromConsole("a");
        b = inputDoubleFromConsole("b");
        c = inputDoubleFromConsole("c");

        System.out.println("a: " + elevate(a));
        System.out.println("b: " + elevate(b));
        System.out.println("c: " + elevate(c));
    }
}