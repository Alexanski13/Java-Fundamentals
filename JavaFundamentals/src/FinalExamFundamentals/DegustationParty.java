package FinalExamFundamentals;

import java.util.*;

public class DegustationParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        Map<String, List<String>> guestMeals = new LinkedHashMap<>();

        int count = 0;
        while (!line.equals("Stop")) {
            String[] data = line.split("-");
            String command = data[0];
            String guest = data[1];
            String meal = data[2];

            switch (command) {
                case "Like":
                    guestMeals.putIfAbsent(guest, new ArrayList<>());
                    if (!guestMeals.get(guest).contains(meal)) {
                        guestMeals.get(guest).add(meal);
                    }
                    System.out.println();
                    break;
                case "Dislike":
                    if (guestMeals.containsKey(guest)) {
                        if (guestMeals.get(guest).contains(meal)) {
                            guestMeals.get(guest).remove(meal);
                            System.out.printf("%s doesn't like the %s.%n", guest, meal);
                            count++;
                        } else {
                            System.out.printf("%s doesn't have the %s in his/her collection.%n", guest, meal);
                        }
                    } else {
                        System.out.printf("%s is not at the party.%n", guest);
                    }

                    break;
            }

            line = scanner.nextLine();
        }
        for (Map.Entry<String, List<String>> entry : guestMeals.entrySet()) {
            System.out.printf("%s: %s%n", entry.getKey(),
                    entry.getValue().toString().replace("[", "").replace("]", ""));
        }
        System.out.printf("Unliked meals: %d", count);
    }
}
