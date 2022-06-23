package DataTypesAndVariablesExercises;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int capacity = 255;
        int n = Integer.parseInt(scanner.nextLine());

        int sumLiters = 0;

        for (int i = 0; i < n; i++) {
            int liters = Integer.parseInt(scanner.nextLine());
            sumLiters += liters;
            if (sumLiters > capacity) {
                sumLiters -= liters;
                System.out.print("Insufficient capacity!\n");
            }
        }
        System.out.println(sumLiters);
    }
}
