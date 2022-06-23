package DataTypesAndVariablesExercises;

import java.util.Scanner;

public class Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberBalls = Integer.parseInt(scanner.nextLine());
        long maxSnowballValue = 0;
        int maxSnowballSnow = 0;
        int maxSnowballTime = 0;
        int maxSnowballQuality = 0;

        for (int i = 1; i <= numberBalls; i++) {

            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());

            long snowballValue = (long) Math.pow(snowballSnow / snowballTime, snowballQuality);

            if (snowballValue > maxSnowballValue) {
                maxSnowballQuality = snowballQuality;
                maxSnowballSnow = snowballSnow;
                maxSnowballTime = snowballTime;
                maxSnowballValue = snowballValue;
            }
        }
        System.out.printf("%d : %d = %d (%d)", maxSnowballSnow, maxSnowballTime, maxSnowballValue, maxSnowballQuality);
    }
}
