package by.training.simplestapp.main;

import java.util.Scanner;

public class Main9 {
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
        int m1, m2, k;

        m1 = inputIntFromConsole("m1");
        while (m1 <= 0) {
            System.out.println("Wrong input. \"m1\" should be natural. Please, try again.");
            m1 = inputIntFromConsole("m1");
        }
        m2 = inputIntFromConsole("m2");
        while (m2 <= 0) {
            System.out.println("Wrong input. \"m2\" should be natural. Please, try again.");
            m2 = inputIntFromConsole("m2");
        }
        k = inputIntFromConsole("k");
        while (k <= 0 || k >= m2) {
            System.out.println("Wrong input. \"k\" should be natural or . Please, try again.");
            k = inputIntFromConsole("k");
        }

        int[] mas1 = new int[m1];

        for (int i = 0; i < m1; i++) {
            mas1[i] = inputIntFromConsole("a[" + i + "]");
        }

        int[] mas2 = new int[m2];

        for (int i = 0; i < (m2); i++) {
            mas2[i] = inputIntFromConsole("a[" + i + "]");
        }

        int[] mas = new int[m1 + m2];

        for (int i = 0; i < (m1 + m2); i++) {
            if (i <= k) {
                mas[i] = mas1[i];
            } else if (i <= k + m2) {
                mas[i] = mas2[i - k];
            } else {
                mas[i] = mas1[i - m2];
            }
        }
    }
}
