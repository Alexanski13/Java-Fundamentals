package ListsExecise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> arr = Arrays.stream(scanner.nextLine()
                        .split("\\|"))
                .collect(Collectors.toList());

        List<String> resultArr = new ArrayList<>();

        for (int i = arr.size() - 1; i >= 0; i--) {
            String[] numbers = arr.get(i).split("\\s+");
            for (int j = 0; j < numbers.length; j++) {
                if (!numbers[j].equals("")) {
                    resultArr.add(numbers[j]);
                }
            }
        }
        String print = resultArr.toString().trim();
        System.out.println(print.replaceAll("\\[|,|\\]", ""));
    }
}
