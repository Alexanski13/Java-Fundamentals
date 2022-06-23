package DataTypesAndVariablesExercises;

import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startingYield = Integer.parseInt(scanner.nextLine());

        int totalHarvest = 0;
        int countDays = 0;

        while (startingYield > 0) {
            if (startingYield < 100) {
                if (totalHarvest < 26) {
                    break;
                }
                totalHarvest -= 26;
                break;
            }
            totalHarvest += startingYield - 26;
            startingYield -= 10;

            countDays++;
        }
        System.out.println(countDays);
        System.out.println(totalHarvest);
    }
}