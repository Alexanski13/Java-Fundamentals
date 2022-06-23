package ArraysExercise;

import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arrays = Integer.parseInt(scanner.nextLine());

        String[] firstArray = new String[arrays];
        String[] secondArray = new String[arrays];

        for (int i = 1; i <= arrays; i++) {
            String[] line = scanner.nextLine().split(" ");

            if (i % 2 != 0) {
                firstArray[i - 1] = line[0];
                secondArray[i - 1] = line[1];
            } else {
                firstArray[i - 1] = line[1];
                secondArray[i - 1] = line[0];
            }
        }
        for (int i = 0; i < firstArray.length; i++) {
            System.out.print(firstArray[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < secondArray.length; i++) {
            System.out.print(secondArray[i] + " ");
        }
    }
}
