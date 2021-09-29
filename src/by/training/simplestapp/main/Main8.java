package by.training.simplestapp.main;

import java.util.Scanner;

public class Main8 {
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
        int n, k;

        n = inputIntFromConsole("n");
        while (n <= 0) {
            System.out.println("Wrong input. \"n\" should be natural. Please, try again.");
            n = inputIntFromConsole("n");
        }
        k = inputIntFromConsole("k");
        while (k <= 0) {
            System.out.println("Wrong input. \"k\" should be natural. Please, try again.");
            k = inputIntFromConsole("k");
        }

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = inputIntFromConsole("a[" + i + "]");
            while (a[i] <= 0) {
                System.out.println("Wrong input. a[" + i + "] should be natural. Please, try again.");
                a[i] = inputIntFromConsole("a[" + i + "]");
            }
        }

        int sum = 0;
        for (int i : a) {
            if (i%k == 0) sum += i;
        }

        System.out.println("Sum: " + sum);
    }
}