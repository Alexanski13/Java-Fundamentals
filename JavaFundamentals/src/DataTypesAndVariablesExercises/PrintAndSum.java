package DataTypesAndVariablesExercises;

import java.util.Scanner;

public class PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int finish = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int i = start; i <= finish; i++) {
            sum += i;
            System.out.print(i + " ");
        }
        System.out.printf("%nSum: %d", sum);
    }
}
