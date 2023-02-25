package ListsLecture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        /*List<Integer> sortedA = new ArrayList<>(Arrays.asList(10, 6, 3, 2, 1));
        List<Integer> sortedB = new ArrayList<>(Arrays.asList(9, 8, 4, 0));

        int indexA = 0;
        int indexB = 0;
        List<Integer> merged = new ArrayList<>();
        while (indexA < sortedA.size() || indexB < sortedB.size()) {
            if (indexA < sortedA.size() && sortedA.get(indexA) > sortedB.get(indexB)) {
                merged.add(sortedA.get(indexA));
                indexA++;
            } else {
                merged.add(sortedB.get(indexB));
                indexB++;
            }
        }

        for (int number: merged) {
            System.out.print(number + " ");
        }*/
        Scanner scanner = new Scanner(System.in);

        int[] integers = nextIntArray(scanner);

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] tokens = input.split("\\s+");
            String command = tokens[0];
            switch (command) {
                case "swap":
                    int index1 = Integer.parseInt(tokens[1]);
                    int index2 = Integer.parseInt(tokens[2]);
                    if (isValidIndex(index1, integers, index2)){
                        int temp = integers[index1];
                        integers[index1] = integers[index2];
                        integers[index2] = temp;
                    }
                    break;
                case "multiply":
                    index1 = Integer.parseInt(tokens[1]);
                    index2 = Integer.parseInt(tokens[2]);
                    if (isValidIndex(index1, integers, index2)){
                        int temp = integers[index1] * integers[index2];
                        integers[index1] = temp;
                    }
                    break;
                case "decrease":
                    for (int i = 0; i < integers.length; i++) {
                        int temp = integers[i] - 1;
                        integers[i] = temp;
                    }
                    break;
            }


            input = scanner.nextLine();
        }

        printArray(integers,", ");
    }

    private static boolean isValidIndex(int index1, int[] integers, int index2) {
        return index1 >= 0 && index1 < integers.length && index2 >= 0 && index2 < integers.length;
    }

    private static int[] nextIntArray(Scanner scanner) {
        String[] intsAsStrings = scanner.nextLine().split("\\s+");
        int[] arr = new int[intsAsStrings.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(intsAsStrings[i]);
        }
        return arr;
    }

    private static void printArray(int[] array, String separator) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(separator);
            }
        }
    }
}