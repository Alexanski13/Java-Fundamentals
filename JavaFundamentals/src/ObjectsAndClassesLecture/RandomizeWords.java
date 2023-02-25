package ObjectsAndClassesLecture;

import java.util.Random;
import java.util.Scanner;

public class RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");
        Random rnd = new Random();

        for (int i = 0; i < words.length; i++) {
            int randomIndex = rnd.nextInt(words.length);
            String a = words[randomIndex];
            String b = words[i];

            words[randomIndex] = b;
            words[i] = a;
        }
        System.out.println(String.join(System.lineSeparator(), words));
    }
}
