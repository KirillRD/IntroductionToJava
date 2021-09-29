package com.epam.java_web_development.main;

import java.util.Scanner;

public class Main4 {
    public static int inputIntFromConsole(String str) {
        int value;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input " + str + ": ");
        while (!sc.hasNextInt()) {
            sc.nextLine();
            System.out.println("Wrong input. Input is not a number. Please, try again.");
            System.out.print("Input " + str + ": ");
        }
        value = sc.nextInt();
        return value;
    }

    public static void main(String[] args) {
        int x, y;

        x = inputIntFromConsole("x");
        y = inputIntFromConsole("y");
        if ((x >= -2 && x <= 2 && y <= 4 && y >= 0) || (x >= -4 && x <= 4 && y >= -3 && y <= 0)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}