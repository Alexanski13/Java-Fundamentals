package RegularExpressionsLecture;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchPhoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> matchedNumber = new LinkedList<>();

        String regex = "\\+359([- ])2\\1[\\d]{3}\\1[\\d]{4}\\b";
        String telephone = scanner.nextLine();

        Pattern pattern = Pattern.compile(regex);
        Matcher phoneMatcher = pattern.matcher(telephone);

        while (phoneMatcher.find()) {
            matchedNumber.add(phoneMatcher.group());
        }
        System.out.println(String.join(", ", matchedNumber));
    }
}
