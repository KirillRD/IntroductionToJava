package com.epam.java_web_development.main;

import java.util.Scanner;

public class Main1 {
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
        int i;
        String str;

        do {
            i = inputIntFromConsole("i");

            str = String.valueOf(i);

            if (str.length() == 4) {
                int firstNumber = Integer.parseInt(str.substring(0, 1));
                int secondNumber = Integer.parseInt(str.substring(1, 2));
                int thirdNumber = Integer.parseInt(str.substring(2, 3));
                int fourthNumber = Integer.parseInt(str.substring(3, 4));
                if ((firstNumber + secondNumber) == (thirdNumber + fourthNumber)) {
                    System.out.println("true");
                } else {
                    System.out.println("false");
                }
            } else {
                System.out.println("Wrong input. Input is not four-digit number. Please, try again.");
            }
        } while (str.length() != 4);
    }
}