package FinalExamFundamentals;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MessageTranslator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Pattern pattern = Pattern.compile("(!)(?<message>[A-Z][a-z]{2,})\\1:\\[(?<alphabet>[A-Za-z]{8,})\\]");

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            Matcher matcher = pattern.matcher(line);
            if (matcher.find()) {
                String command = matcher.group("message");
                char[] translate = matcher.group("alphabet").toCharArray();
                System.out.printf("%s: ", command);
                for (char c : translate) {
                    System.out.printf("%d ", (int) c);
                }
                System.out.println();
            } else {
                System.out.println("The message is invalid");
            }
        }
    }
}
