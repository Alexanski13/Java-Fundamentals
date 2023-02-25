package AssociativeArraysLecture;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class WordFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        List<String> result = Arrays.stream(input)
                .filter(s -> s.length() % 2 == 0)
                .collect(Collectors.toList());

        for (String s : result) {
            System.out.println(s);
        }
    }
}
