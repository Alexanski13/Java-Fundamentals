package FinalExamFundamentals;

import java.util.Scanner;

public class Hogwarts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder sb = new StringBuilder(scanner.nextLine());

        String input = scanner.nextLine();

        while (!input.equals("Abracadabra")) {
            String[] data = input.split(" ");
            String command = data[0];

            switch (command) {
                case "Abjuration": {
                    sb.replace(0, sb.length(), sb.toString().toUpperCase());
                    System.out.println(sb);
                    break;
                }
                case "Necromancy": {
                    sb.replace(0, sb.length(), sb.toString().toLowerCase());
                    System.out.println(sb);
                    break;
                }
                case "Illusion": {
                    int index = Integer.parseInt(data[1]);
                    String letter = data[2];
                    if (index >= 0 && index < sb.length()) {
                        sb.deleteCharAt(index);
                        sb.insert(index, letter);
                        System.out.println("Done!");
                    } else {
                        System.out.println("The spell was too weak.");
                    }
                    break;
                }
                case "Divination": {
                    String occurrence = data[1];
                    String replacement = data[2];
                    if (sb.toString().contains(occurrence)) {
                        String replacedString = sb.toString().replaceAll(occurrence, replacement);
                        sb.setLength(0);
                        sb.append(replacedString);
                    }
                    System.out.println(sb);
                    //MIGHT NEED TO CHECK FOR SEVERAL OCCURENCES
                    break;
                }
                case "Alteration": {
                    StringBuilder substring = new StringBuilder(data[1]);
                    if (sb.toString().contains(substring)) {
                        int start = sb.indexOf(String.valueOf(substring.charAt(0)));
                        int end = start + substring.length() - 1;
                        sb.delete(start, end + 1);
                        System.out.println(sb);
                    }
                    break;
                }
                default: {
                    System.out.println("The spell did not work!");
                }
            }

            input = scanner.nextLine();
        }
    }
}
