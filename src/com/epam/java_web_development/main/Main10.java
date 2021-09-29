package com.epam.java_web_development.main;

import java.util.Scanner;

public class Main10 {
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
        int n;

        n = inputIntFromConsole("n");
        while (n <= 0 || n%2 == 1) {
            System.out.println("Wrong input. \"n\" should be natural and even. Please, try again.");
            n = inputIntFromConsole("n");
        }

        int[][] mas = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i%2 == 1) {
                    mas[i][j] = j;
                } else {
                    mas[i][j] = n - j;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("[%2d]", mas[i][j]);
            }
            System.out.println();
        }
    }
}