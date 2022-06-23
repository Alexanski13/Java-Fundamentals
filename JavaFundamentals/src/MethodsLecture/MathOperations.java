package MethodsLecture;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        char operator = scanner.nextLine().charAt(0);
        int b = Integer.parseInt(scanner.nextLine());

        int result = (int) calculate(a, operator, b);
        System.out.println(new DecimalFormat("0.##").format(calculate(a, operator, b)));
    }

    private static double calculate(int a, char operator, int b) {
        double result = 0.00;

        switch (operator) {
            case '/':
                result = a / b;
                break;
            case '*':
                result = a * b;
                break;
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
        }
        return result;
    }
}
