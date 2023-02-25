package ListsExecise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagons = (Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList()));

        int capacity = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            var inputArgs = input.split(" ");
            if (inputArgs[0].equals("Add")) {
                wagons = addPassengers(Integer.parseInt(inputArgs[1]), wagons);
            } else {
                int passengers = Integer.parseInt(inputArgs[0]);
                for (int i = 0; i < wagons.size(); i++) {
                    int currentWagon = wagons.get(i);
                    if (capacity >= currentWagon + passengers) {
                        wagons.set(i, currentWagon + passengers);
                        break;
                    }
                }
            }

            input = scanner.nextLine();
        }
        wagons.forEach(x -> System.out.print(x + " "));
    }

    private static List<Integer> addPassengers(int commandArgs, List<Integer> wagons) {
        wagons.add(commandArgs);
        return wagons;
    }
}
