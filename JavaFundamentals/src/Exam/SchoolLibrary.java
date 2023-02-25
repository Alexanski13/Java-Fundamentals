package Exam;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SchoolLibrary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> books = Arrays.stream(scanner.nextLine().split("&"))
                .collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("Done")) {
            String[] tokens = input.split("\\s+" + "\\|" + "\\s+");
            String command = tokens[0];
            String bookName;

            switch (command) {
                case "Add Book":
                    bookName = tokens[1];
                    if (!books.contains(bookName)) {
                        books.add(0, bookName);
                    }
                    break;
                case "Take Book":
                    bookName = tokens[1];
                    books.remove(bookName);
                    break;
                case "Swap Books":
                    bookName = tokens[1];
                    String secondBook = tokens[2];
                    if (books.contains(bookName) && books.contains(secondBook)) {
                        Collections.swap(books, books.indexOf(bookName), books.indexOf(secondBook));
                    }
                    break;
                case "Insert Book":
                    bookName = tokens[1];
                    if (!books.contains(bookName)) {
                        books.add(bookName);
                    }
                    break;
                case "Check Book":
                    int index = Integer.parseInt(tokens[1]);
                    if (index >= 0 && index < books.size()) {
                        String nameOnIndex = String.valueOf(books.get(index));
                        System.out.printf("%s%n", nameOnIndex);
                    }
                    break;
            }

            input = scanner.nextLine();
        }
        System.out.print(String.join(", ", books));
    }
}
