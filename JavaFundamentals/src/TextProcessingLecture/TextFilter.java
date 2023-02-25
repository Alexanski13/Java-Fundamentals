package TextProcessingLecture;

import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] banWords = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (String banWord : banWords) {
            String censored = repeat("*", banWord.length());
            text = text.replace(banWord, censored);
        }
        System.out.println(text);
    }

    private static String repeat(String word, int repetitions) {
        char[] repeated = new char[word.length() * repetitions];

        for (int i = 0; i < repeated.length; i++) {
            repeated[i] = word.charAt(i % word.length());
        }
        return new String(repeated);
    }
}
