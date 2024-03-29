package ListsExecise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstCards = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> secondCards = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int sum = 0;

        while (!(firstCards.isEmpty() || secondCards.isEmpty())) {
            if (firstCards.get(0).equals(secondCards.get(0))) {
                firstCards.remove(0);
                secondCards.remove(0);
            } else if (firstCards.get(0) > secondCards.get(0)) {
                firstCards.add(firstCards.get(0));
                firstCards.add(secondCards.get(0));
                firstCards.remove(0);
                secondCards.remove(0);
            } else if (secondCards.get(0) > firstCards.get(0)) {
                secondCards.add(secondCards.get(0));
                secondCards.add(firstCards.get(0));
                secondCards.remove(0);
                firstCards.remove(0);
            }
        }
        if (firstCards.isEmpty()) {
            for (Integer secondCard : secondCards) {
                sum += secondCard;
            }
            System.out.printf("Second player wins! Sum: %d", sum);
        } else {
            for (Integer firstCard : firstCards) {
                sum += firstCard;
            }
            System.out.printf("First player wins! Sum: %d", sum);
        }
    }
}