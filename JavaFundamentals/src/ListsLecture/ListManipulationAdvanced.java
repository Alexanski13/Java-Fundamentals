package ListsLecture;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] data = input.split("\\s+");

            switch (data[0]) {
                case "Contains":
                    int numberToCheck = Integer.parseInt(data[1]);
                    if (numbers.contains(numberToCheck)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    int output = 0;
                    if (data[1].equals("even")) {
                        for (int i = 0; i < numbers.size(); i++) {
                            if (numbers.get(i) % 2 == 0) {
                                System.out.print(numbers.get(i) + " ");
                            }
                        }
                    } else if (data[1].equals("odd")) {
                        for (int i = 0; i < numbers.size(); i++) {
                            if (numbers.get(i) % 2 != 0) {
                                System.out.print(numbers.get(i) + " ");
                            }
                        }
                    }
                    System.out.println();
                    break;
                case "Get":
                    int sum = 0;

                    for (int number : numbers) {
                        sum += number;
                    }
                    System.out.printf("%d%n", sum);
                    break;
                case "Filter":
                    String outputFilter = "";
                    int num = Integer.parseInt(data[2]);
                    if (data[1].equals("<")) {
                        for (int aList : numbers) {
                            if (aList < num) {
                                outputFilter += String.valueOf(aList) + " ";
                            }
                        }
                        System.out.println(outputFilter);
                    } else if (data[1].equals(">")) {
                        for (int aList : numbers) {
                            if (aList > num) {
                                outputFilter += String.valueOf(aList) + " ";
                            }
                        }
                        System.out.println(outputFilter);
                    } else if (data[1].equals(">=")) {
                        for (int aList : numbers) {
                            if (aList >= num) {
                                outputFilter += String.valueOf(aList) + " ";
                            }
                        }
                        System.out.println(outputFilter);
                    } else if (data[1].equals("<=")) {
                        for (int aList : numbers) {
                            if (aList <= num) {
                                outputFilter += String.valueOf(aList) + " ";
                            }
                        }
                        System.out.println(outputFilter);
                    }
                    break;
            }
            input = scanner.nextLine();
        }
    }
}
