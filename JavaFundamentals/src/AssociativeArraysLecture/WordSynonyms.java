package AssociativeArraysLecture;

import java.util.*;

public class WordSynonyms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberPairs = Integer.parseInt(sc.nextLine());

        Map<String, List<String>> wordSynonyms = new TreeMap<>();

        for (int i = 0; i < numberPairs; i++) {
            String word = sc.nextLine();
            String synonym = sc.nextLine();

            List<String> currentSynonyms = wordSynonyms.get(word);
            if (currentSynonyms != null) {
                currentSynonyms.add(synonym);
                wordSynonyms.put(word, currentSynonyms);
            } else {
                currentSynonyms = new ArrayList<>();
                currentSynonyms.add(synonym);
                wordSynonyms.put(word, currentSynonyms);
            }
        }
        for (Map.Entry<String, List<String>> entry : wordSynonyms.entrySet()) {
            System.out.printf("%s - %s%n", entry.getKey(),
                    entry.getValue().toString().replace("[", "").replace("]", ""));
        }
    }
}