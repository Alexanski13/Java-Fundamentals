package MethodsLecture;

import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        if (input < 0) {
            input = input * (-1);
        }
        int multiple = getMultiplesOfEvenAndOdds(input);
        System.out.println(multiple);

    }

    private static int getMultiplesOfEvenAndOdds(int number) {
        int evensSum = getSumOfEvenDigits(number);
        int oddsSum = getSumOfOddDigits(number);

        return evensSum * oddsSum;
    }

    private static int getSumOfOddDigits(int number) {
        int oddSum = 0;
        while (number != 0) {
            int digits = number % 10;
            if (digits % 2 == 1) {
                oddSum += digits;
            }
            number /= 10;

        }
        return oddSum;
    }

    private static int getSumOfEvenDigits(int number) {
        int evenSum = 0;
        while (number != 0) {
            int digits = number % 10;
            if (digits % 2 == 0) {
                evenSum += digits;
            }
            number /= 10;

        }
        return evenSum;
    }
}
