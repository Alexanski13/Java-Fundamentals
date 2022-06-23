package DataTypesAndVariablesLectures;

import java.util.Scanner;

public class RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        boolean isSpecial = false;

        for (int number = 1; number <= n; number++) {
            int digits = number;
            int sum = 0;
            while (digits > 0) {
                sum += digits % 10;
                digits = digits / 10;
            }
            isSpecial = (sum == 5) || (sum == 7) || (sum == 11);
            if (isSpecial) {
                System.out.printf("%d -> True%n", number);
            } else {
                System.out.printf("%d -> False%n",number);
            }
        }

    }
}
