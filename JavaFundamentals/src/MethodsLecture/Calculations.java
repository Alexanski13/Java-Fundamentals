package MethodsLecture;

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        switch (command) {
            case "add":
                add(a, b);
                break;
            case "multiply":
                mutliply(a, b);
                break;
            case "subtract":
                subtract(a, b);
                break;
            case "divide":
                divide(a, b);
                break;
        }
    }

    private static void divide(int a, int b) {
        int division = a / b;
        System.out.println(division);
    }

    private static void subtract(int a, int b) {
        int subtraction = a - b;
        System.out.println(subtraction);
    }

    private static void mutliply(int a, int b) {
        int multiply = a * b;
        System.out.println(multiply);
    }

    private static void add(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }
}
