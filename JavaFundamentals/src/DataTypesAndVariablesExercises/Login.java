package DataTypesAndVariablesExercises;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String correctPassword = "";

        for (int i = username.length() - 1; i >= 0; i--) {
            correctPassword += username.charAt(i);
        }

        String attempt = scanner.nextLine();
        int counter = 0;

        while (true) {
            if (attempt.equals(correctPassword)) {
                System.out.printf("User %s logged in.", username);
                break;
            } else {
                counter++;
                if (counter == 4) {
                    System.out.printf("User %s blocked!", username);
                    break;
                }
                System.out.println("Incorrect password. Try again.");
            }
            attempt = scanner.nextLine();
        }
    }
}
