package DataTypesAndVariablesLectures;

import java.util.Scanner;

public class ConvertMetersToKilometers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double m = (double) n / 1000;

        System.out.printf("%.2f", m);
    }
}
