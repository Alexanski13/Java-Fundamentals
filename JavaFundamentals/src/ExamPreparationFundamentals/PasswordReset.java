package ExamPreparationFundamentals;

import java.util.Scanner;

public class PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder sb = new StringBuilder(scanner.nextLine());

        String input = scanner.nextLine();

        while (!input.equals("Reveal")) {
            String[] data = input.split(":\\|:");
            String command = data[0];

            switch (command) {
                case "InsertSpace": {
                    int index = Integer.parseInt(data[1]);
                    sb.insert(index, " ");
                    break;
                }
                case "Reverse": {
                    StringBuilder substring = new StringBuilder(data[1]);
                    if (sb.toString().contains(substring)) {
                        int start = sb.indexOf(String.valueOf(substring.charAt(0)));
                        int end = start + substring.length() - 1;
                        sb.delete(start, end + 1);
                        substring.reverse();
                        sb.append(substring);
                    } else {
                        System.out.println("error");
                        input = scanner.nextLine();
                        continue;
                    }
                    break;
                }
                case "ChangeAll": {
                    String occurrence = data[1];
                    String replacement = data[2];
                    String replacedString = sb.toString().replaceAll(occurrence, replacement);
                    sb.setLength(0);
                    sb.append(replacedString);
                    break;
                }
            }
            System.out.println(sb.toString());
            input = scanner.nextLine();
        }
        System.out.printf("You have a new text message: %s", sb);
    }
}
