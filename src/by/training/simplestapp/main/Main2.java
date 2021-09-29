package by.training.simplestapp.main;

import java.util.Scanner;

public class Main2 {
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

        do {
            a = inputDoubleFromConsole("a");
            while (a == 0) {
                System.out.println("Wrong input. \"a\" should be not zero. Please, try again.");
                a = inputDoubleFromConsole("a");
            }
            b = inputDoubleFromConsole("b");
            while (b == 0) {
                System.out.println("Wrong input. \"b\" should be not zero. Please, try again.");
                b = inputDoubleFromConsole("b");
            }
            c = inputDoubleFromConsole("c");
            if ((Math.pow(b, 2) + 4*a*c) < 0) {
                System.out.println("Wrong input. b^2 + 4*a*c should be equal or bigger than zero. Please, try again.");
            }
        } while ((Math.pow(b, 2) + 4*a*c) < 0);

        System.out.println("Expression: " + ((b + Math.sqrt(Math.pow(b, 2) + 4*a*c))/(2*a)-Math.pow(a, 3)*c+Math.pow(b, -2)));
    }
}