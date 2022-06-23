package DataTypesAndVariablesLectures;

import java.util.Scanner;

public class BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();
        int minutes = scanner.nextInt();
        minutes += 30;
        if (minutes > 59) {
            hours++;
            minutes -= 60;
        }
        if (hours > 23) {
            hours -= 24;
        }
        if (minutes < 10) {
            System.out.printf("%d:%02d%n", hours, minutes);
        } else {
            System.out.printf("%d:%d%n", hours, minutes);
        }
    }
}
