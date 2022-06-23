package MethodsLecture;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        calculatePrice(product,quantity);
    }

    private static void calculatePrice(String product, int quantity) {
        double total = 0.0;

        switch (product) {
            case "coffee":
                total = 1.50 * quantity;
                System.out.printf("%.2f", total);
                break;
            case "water":
                total = 1.00 * quantity;
                System.out.printf("%.2f", total);
                break;
            case "coke":
                total = 1.40 * quantity;
                System.out.printf("%.2f", total);
                break;
            case "snacks":
                total = 2.00 * quantity;
                System.out.printf("%.2f", total);
                break;
        }
    }
}
