package DataTypesAndVariablesExercises;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        String groupType = scanner.nextLine();
        String day = scanner.nextLine();

        double pricePerPerson = 0.0;
        double totalGroup = 0.0;
        double sum = 0.0;

        if (day.equals("Friday")) {
            switch (groupType) {
                case "Students":
                    pricePerPerson = 8.45;
                    totalGroup = pricePerPerson * people;
                    if (people >= 30) {
                        totalGroup = totalGroup - totalGroup * 15 / 100;
                    }
                    break;
                case "Business":
                    pricePerPerson = 10.90;
                    if (people >= 100) {
                        totalGroup = pricePerPerson * (people - 10);
                    } else {
                        totalGroup = pricePerPerson * people;
                    }
                    break;
                case "Regular":
                    pricePerPerson = 15;
                    totalGroup = pricePerPerson * people;
                    if (people >= 10 && people <= 20) {
                        totalGroup = totalGroup - totalGroup * 5 / 100;
                    }
                    break;
            }

        } else if (day.equals("Saturday")) {
            switch (groupType) {
                case "Students":
                    pricePerPerson = 9.80;
                    totalGroup = pricePerPerson * people;
                    if (people >= 30) {
                        totalGroup = totalGroup - totalGroup * 15 / 100;
                    }
                    break;
                case "Business":
                    pricePerPerson = 15.60;
                    if (people >= 100) {
                        totalGroup = pricePerPerson * (people - 10);
                    } else {
                        totalGroup = pricePerPerson * people;
                    }
                    break;
                case "Regular":
                    pricePerPerson = 20;
                    totalGroup = pricePerPerson * people;
                    if (people >= 10 && people <= 20) {
                        totalGroup = totalGroup - totalGroup * 5 / 100;
                    }
                    break;
            }
        } else if (day.equals("Sunday")) {
            switch (groupType) {
                case "Students":
                    pricePerPerson = 10.46;
                    totalGroup = pricePerPerson * people;
                    if (people >= 30) {
                        totalGroup = totalGroup - totalGroup * 15 / 100;
                    }
                    break;
                case "Business":
                    pricePerPerson = 16;
                    if (people >= 100) {
                        totalGroup = pricePerPerson * (people - 10);
                    } else {
                        totalGroup = pricePerPerson * people;
                    }
                    break;
                case "Regular":
                    pricePerPerson = 22.50;
                    totalGroup = pricePerPerson * people;
                    if (people >= 10 && people <= 20) {
                        totalGroup = totalGroup - totalGroup * 5 / 100;
                    }
                    break;
            }
        }
        System.out.printf("Total price: %.2f", totalGroup);
    }
}