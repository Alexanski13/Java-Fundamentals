package MethodsExercise;

import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int n3 = Integer.parseInt(scanner.nextLine());


        System.out.println(sum(n1, n2, n3));
    }

    private static int subtractSum(int sum, int n3) {
        return sum - n3;
    }

    private static int sum(int n1, int n2, int n3) {
        int sum = n1 + n2;

        int result = subtractSum(sum, n3);

        return result;
    }
}
