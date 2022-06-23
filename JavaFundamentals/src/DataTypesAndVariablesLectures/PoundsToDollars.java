package DataTypesAndVariablesLectures;

import java.math.BigDecimal;
import java.util.Scanner;

public class PoundsToDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigDecimal britishPounds = new BigDecimal(scanner.nextLine());
        BigDecimal dollar = new BigDecimal(1.36);
        BigDecimal toDollars = britishPounds.multiply(dollar);

        System.out.printf("%.3f", toDollars);
    }
}
