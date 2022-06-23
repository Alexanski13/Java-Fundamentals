package MethodsLecture;

import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeVariable = scanner.nextLine();

        switch (typeVariable) {
            case "int":
                int number1 = Integer.parseInt(scanner.nextLine());
                int number2 = Integer.parseInt(scanner.nextLine());
                getMax(number1, number2);
                System.out.println(getMax(number1, number2));
                break;
            case "char":
                char one = scanner.nextLine().charAt(0);
                char two = scanner.nextLine().charAt(0);
                getMax(one, two);
                System.out.println(getMax(one, two));
                break;
            case "string":
                String text1 = scanner.nextLine();
                String text2 = scanner.nextLine();
                getMax(text1, text2);
                System.out.println(getMax(text1, text2));
                break;
        }

    }

    private static String getMax(String text1, String text2) {
        if (text1.compareTo(text2) >= 0) {
            return text1;
        }
        return  text2;
    }

    private static char getMax(char one, char two) {
        if (one > two) {
            return one;
        }
        return two;
    }

    private static int getMax(int number1, int number2) {
        if (number1 > number2) {
            return number1;
        }
        return number2;
    }
}
