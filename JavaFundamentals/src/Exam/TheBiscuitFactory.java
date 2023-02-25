package Exam;

import java.util.Scanner;

public class TheBiscuitFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int biscuitsPerDay = scanner.nextInt();
        int numberWorkers = scanner.nextInt();
        int competitorsBiscuits = scanner.nextInt();

        double totalBiscuitsPerDay = biscuitsPerDay * numberWorkers;
        double totalBiscuitsMade = 0;
        int countDays = 1;

        while (countDays <= 30) {
            if (countDays % 3 == 0) {
                totalBiscuitsMade += Math.floor(totalBiscuitsPerDay * 0.75);
            } else {
                totalBiscuitsMade += Math.floor(totalBiscuitsPerDay);
            }
            countDays++;
        }
        System.out.printf("You have produced %.0f biscuits for the past month.%n", totalBiscuitsMade);
        if (totalBiscuitsMade > competitorsBiscuits) {
            System.out.printf("You produce %.2f percent more biscuits.", ((totalBiscuitsMade - competitorsBiscuits) / competitorsBiscuits) * 100);
        } else {
            System.out.printf("You produce %.2f percent less biscuits.", ((competitorsBiscuits - totalBiscuitsMade) / competitorsBiscuits) * 100);
        }
    }
}
