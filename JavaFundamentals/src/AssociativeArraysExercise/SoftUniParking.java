package AssociativeArraysExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, String> parkingLot = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split("\\s+");
            String command = data[0];
            switch (command) {
                case "register":
                    String username = data[1];
                    String licensePlateNumber = data[2];
                    if (parkingLot.containsKey(username)) {
                        System.out.printf("ERROR: already registered with plate number %s%n", licensePlateNumber);
                    } else {
                        parkingLot.put(username, licensePlateNumber);
                        System.out.printf("%s registered %s successfully%n", username, licensePlateNumber);
                    }
                    break;
                case "unregister":
                    username = data[1];
                    if (!parkingLot.containsKey(username)) {
                        System.out.printf("ERROR: user %s not found%n", username);
                    } else {
                        parkingLot.remove(username);
                        System.out.printf("%s unregistered successfully%n", username);
                    }
                    break;
            }
        }
        parkingLot.forEach((k, v) -> System.out.printf("%s => %s%n", k, v));
    }
}
