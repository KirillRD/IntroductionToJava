package com.epam.java_web_development.main;

import java.util.Scanner;

public class Main6 {
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

    public static void main(String[] args) {
        double a, b, c;

        a = inputDoubleFromConsole("a");
        b = inputDoubleFromConsole("b");
        c = inputDoubleFromConsole("c");

        double max = a, min = a;
        if (max < b) max = b;
        if (max < c) max = c;
        if (min > b) min = b;
        if (min > c) min = c;

        System.out.println("Sum: " + (max + min));
    }
}