package by.training.simplestapp.main;

import java.util.Scanner;

public class Main3 {
    public static int inputIntFromConsole(String str) {
        int value;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input " + str + ": ");
        while (!sc.hasNextInt()) {
            sc.nextLine();
            System.out.println("Wrong input. Please, try again.");
            System.out.print("Input " + str + ": ");
        }
        value = sc.nextInt();
        return value;
    }

    public static void main(String[] args) {
        int a, b;

        a = inputIntFromConsole("a");
        while (a <= 0) {
            System.out.println("Wrong input. \"a\" should be bigger than zero. Please, try again.");
            a = inputIntFromConsole("a");
        }
        b = inputIntFromConsole("b");
        while (b <= 0) {
            System.out.println("Wrong input. \"b\" should be bigger than zero. Please, try again.");
            b = inputIntFromConsole("b");
        }

        System.out.println("P: " + (Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)) + a + b));
        System.out.println("S: " + a*b/2);
    }
}