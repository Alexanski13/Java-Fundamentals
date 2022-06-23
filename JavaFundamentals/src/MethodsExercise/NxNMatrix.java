package MethodsExercise;

import java.util.Scanner;

public class NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        printMatrix(number);
    }

    private static void printMatrix(int number) {
        for (int r = 0; r < number; r++) {
            for (int c = 0; c < number; c++) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
