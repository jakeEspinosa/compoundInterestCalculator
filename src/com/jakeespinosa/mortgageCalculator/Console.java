package com.jakeespinosa.mortgageCalculator;

import java.util.Scanner;

public class Console {
    private static Scanner scanner = new Scanner(System.in);

    private static double readNumber() {
        double number = 0;

        while (!scanner.hasNextDouble()) {
            System.out.print("Enter a number: ");
            scanner.next();
        } number = scanner.nextDouble();
        return number;
    }

    public static double readBoundNumber(
            String prompt,
            int min,
            int max) {
        double number = 0;

        System.out.print(prompt + ": ");
        while (true) {
            number = readNumber();
            if (number >= min && number <= max) {
                break;
            }
            System.out.print("Enter a number between " + min + " and " + max + ": ");
        }
        return number;
    }
}