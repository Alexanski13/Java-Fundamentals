package DataTypesAndVariablesLectures;

import java.util.Scanner;

public class MultiplicationTableV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int multiplier = scanner.nextInt();

        int sum = 0;

        if (multiplier > 10) {
            sum = n * multiplier;
            System.out.printf("%d X %d = %d%n", n, multiplier, sum);
            return;
        }

        for (int i = multiplier; i <= 10; i++) {
            sum = n * i;
            System.out.printf("%d X %d = %d%n", n, i, sum);
        }
    }
}
