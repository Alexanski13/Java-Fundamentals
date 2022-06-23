package MethodsExercise;

import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < number; i++) {
            if (sumIsDivisibleByEight(i) && hasOneOddDigit(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean hasOneOddDigit(int number) {
        String numberAsString = "" + number;
        for (int i = 0; i < numberAsString.length(); i++) {
            int currentDigit = Character.getNumericValue(numberAsString.charAt(i));
            if (currentDigit % 2 != 0) {
                return true;
            }
        }
        return false;
    }

    private static boolean sumIsDivisibleByEight(int number) {
        int sum = 0;
        String numberAsString = "" + number;
        for (int i = 0; i < numberAsString.length(); i++) {
            int currentDigit = Character.getNumericValue(numberAsString.charAt(i));
            sum += currentDigit;
        }
        return sum % 8 == 0;
    }
}
