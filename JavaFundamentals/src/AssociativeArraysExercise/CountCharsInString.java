package AssociativeArraysExercise;

import java.util.*;

public class CountCharsInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split("\\s+");
        Map<Character, Integer> charOccurrences = new LinkedHashMap<>();

        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                char symbol = word.charAt(i);
                if (!charOccurrences.containsKey(symbol)) {
                    charOccurrences.put(symbol, 1);
                } else {
                    charOccurrences.put(symbol, charOccurrences.get(symbol) + 1);
                }
            }
        }
        for (Map.Entry<Character, Integer> entry : charOccurrences.entrySet()) {
            System.out.printf("%c -> %d%n", entry.getKey(), entry.getValue());
        }

    }
}
