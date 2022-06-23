package DataTypesAndVariablesExercises;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int orders = Integer.parseInt(scanner.nextLine());
        double totalPrice = 0.0;

        for (int i = 0; i < orders; i++) {
            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int countCapsules = Integer.parseInt(scanner.nextLine());

            double currentOrderPrice = (days * countCapsules) * pricePerCapsule;
            totalPrice += currentOrderPrice;
            System.out.printf("The price for the coffee is: $%.2f%n", currentOrderPrice);
        }
        System.out.printf("Total: $%.2f", totalPrice);
    }
}
