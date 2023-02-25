package ListsExecise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String[] data = scanner.nextLine().split("\\s+");
        int number = Integer.parseInt(data[0]);
        int power = Integer.parseInt(data[1]);

        while (numbers.contains(number)) {
            int bombIndex = numbers.indexOf(number);
            int start = bombIndex - power;
            int end = bombIndex + power;
            if (start < 0) {
                start = 0;
            }
            if (end >= numbers.size()) {
                end = numbers.size() - 1;
            }

            for (int i = start; i <= end; i++) {
                numbers.remove(start);
            }
        }
        int sum = 0;
        for (Integer integer : numbers) {
            sum += integer;
        }
        System.out.println(sum);
    }
}
