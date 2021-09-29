package by.training.simplestapp.main;

import java.util.Scanner;

public class Main7 {
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
        double a, b, h;

        a = inputDoubleFromConsole("a");
        b = inputDoubleFromConsole("b");
        while (b < a) {
            System.out.println("Wrong input. \"b\" should be bigger than \"a\". Please, try again.");
            b = inputDoubleFromConsole("b");
        }
        h = inputDoubleFromConsole("h");
        while (h > (b-a)) {
            System.out.println("Wrong input. \"h\" should be lower than (b-a). Please, try again.");
            h = inputDoubleFromConsole("h");
        }

        System.out.println("x\t\t\t\tF(x)");
        for (double x = a, f; x <= b; x += h) {
            f = Math.pow(Math.sin(x), 2) - Math.cos(2*x);
            System.out.println(x + "\t\t\t" + Math.ceil(f*1000)/1000);
        }
    }
}