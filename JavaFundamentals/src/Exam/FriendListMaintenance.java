package Exam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FriendListMaintenance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> names = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

        String input = scanner.nextLine();
        int countBlackListed = 0;
        int countLostNames = 0;

        while (!input.equals("Report")) {
            String[] data = input.split(" ");
            String command = data[0];
            switch (command) {
                case "Blacklist":
                    String name = data[1];
                    int indexOfName = names.indexOf(name);
                    if (names.contains(name)) {
                        names.set(indexOfName, "Blacklisted");
                        System.out.printf("%s was blacklisted.%n", name);
                        countBlackListed++;
                    } else {
                        System.out.printf("%s was not found.%n", name);
                    }
                    break;
                case "Error":
                    int index = Integer.parseInt(data[1]);
                    if (index >= 0 && index < names.size()) {
                        if (!names.get(index).equals("Blacklisted") && !names.get(index).equals("Lost")) {
                            String nameOnIndex = String.valueOf(names.get(index));
                            names.set(index, "Lost");
                            System.out.printf("%s was lost due to an error.%n", nameOnIndex);
                            countLostNames++;
                        }
                    }
                    break;
                case "Change":
                    index = Integer.parseInt(data[1]);
                    String newName = data[2];
                    if (index >= 0 && index < names.size()) {
                        String nameOnIndex = String.valueOf(names.get(index));
                        names.set(index, newName);
                        System.out.printf("%s changed his username to %s.%n", nameOnIndex, newName);
                    }
                    break;
            }


            input = scanner.nextLine();
        }

        System.out.printf("Blacklisted names: %d%n", countBlackListed);
        System.out.printf("Lost names: %d%n", countLostNames);
        names.forEach(x -> System.out.print(x + " "));
    }
}
