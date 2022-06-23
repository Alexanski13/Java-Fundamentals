package ArraysExercise;

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wagons = Integer.parseInt(scanner.nextLine());

        int[] passengers = new int[wagons];


        for (int i = 0; i < passengers.length; i++) {
            passengers[i] = Integer.parseInt(scanner.nextLine());
        }

        int sum = 0;
        for (int i = 0; i < passengers.length; i++) {
            sum += passengers[i];
            System.out.print(passengers[i] + " ");
        }
        System.out.printf("%n%s", sum);
    }
}
