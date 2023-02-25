package ExamPrep;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HeartDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] houses = nextIntArray(scanner, "@");

        String input = scanner.nextLine();
        int lastPositionIndex = 0;

        while (!input.equals("Love!")) {
            String[] data = input.split("\\s+");
            int jumpLength = Integer.parseInt(data[1]);
            lastPositionIndex += jumpLength;
            if (lastPositionIndex >= houses.length) {
                lastPositionIndex = 0;
            }
            if (houses[lastPositionIndex] > 0) {
                houses[lastPositionIndex] -= 2;
                if (houses[lastPositionIndex] == 0) {
                    System.out.printf("Place %d has Valentine's day.%n", lastPositionIndex);
                }
            } else {
                System.out.printf("Place %d already had Valentine's day.%n", lastPositionIndex);
            }

            input = scanner.nextLine();
        }

        int failed = 0;
        for (int failures : houses) {
            if (failures != 0) {
                failed++;
            }
        }

        System.out.printf("Cupid's last position was %d.%n", lastPositionIndex);
        if (failed > 0) {
            System.out.printf("Cupid has failed %d places.", failed);
        } else {
            System.out.println("Mission was successful.");
        }
    }

    private static int[] nextIntArray(Scanner scanner, String separator) {
        String[] intsAsStrings = scanner.nextLine().split(separator);
        int[] arr = new int[intsAsStrings.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(intsAsStrings[i]);
        }
        return arr;
    }
}
