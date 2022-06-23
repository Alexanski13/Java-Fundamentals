package DataTypesAndVariablesExercises;

import java.util.Scanner;

public class Pokemon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pokePower = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int exhaustionFactor = Integer.parseInt(scanner.nextLine());

        int currentPower= pokePower;

        int targetsCount = 0;

        while (currentPower >= distance) {
            currentPower = currentPower - distance;
            targetsCount++;

            if (currentPower == pokePower * 0.5 && exhaustionFactor != 0) {
                currentPower /= exhaustionFactor;
            }
        }
        System.out.println(currentPower);
        System.out.println(targetsCount);
    }
}
