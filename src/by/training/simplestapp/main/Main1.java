package by.training.simplestapp.main;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str;

        System.out.print("Write four-digit number: ");
        if (scanner.hasNextInt()) {
            str = scanner.nextLine();
        } else {
            str = scanner.nextLine();
            if (str.equals("exit")) return;
            System.out.println("Wrong input. Input is not a number. Please, try again.");
            continue;
        }

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
    }
}