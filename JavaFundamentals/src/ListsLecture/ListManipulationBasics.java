package ListsLecture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array = scanner.nextLine().split(" ");
        List<Integer> list = new ArrayList<>();
        parsingOfList(array, list);

        String[] command = scanner.nextLine().split(" ");
        while (!command[0].equals("end")) {
            switch (command[0]) {
                case "Add":
                    list.add(Integer.parseInt(command[1]));
                    break;
                case "Remove":
                    list.remove((Integer) Integer.parseInt(command[1]));
                    break;
                case "RemoveAt":
                    int index = Integer.parseInt(command[1]);
                    list.remove(index);
                    break;
                case "Insert":
                    int index1 = Integer.parseInt(command[2]);
                    int digit = Integer.parseInt(command[1]);
                    list.add(index1, digit);
                    break;
            }
            command = scanner.nextLine().split(" ");
        }
        for (int print: list) {
            System.out.print(print + " ");
        }
    }

    private static List parsingOfList(String[] someArray, List<Integer> someList) {
        for (int i = 0; i < someArray.length; i++) {
            someList.add(Integer.parseInt(someArray[i]));
        }
        return someList;
    }
}
