package AssociativeArraysExercise;

import java.util.*;

public class ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        Map<String, List<String>> forceBook = new LinkedHashMap<>();
        while (!line.equals("Lumpawaroo")) {
            if (line.contains("|")) {
                String[] data = line.split("\\s+\\|\\s+");
                String side = data[0];
                String username = data[1];
                forceBook.putIfAbsent(side, new ArrayList<>());
                boolean isMatch = forceBook.entrySet()
                        .stream().noneMatch(entry -> entry.getValue().contains(username));


                if (isMatch) {
                    forceBook.get(side).add(username);
                }
            } else if (line.contains("->")) {
                String[] data = line.split("\\s+->\\s+");
                String side = data[1];
                String username = data[0];

                forceBook.forEach((k, v) -> v.remove(username));
                forceBook.putIfAbsent(side, new ArrayList<>());
                forceBook.get(side).add(username);
                System.out.printf("%s joins the %s side!%n", username, side);
            }
            line = scanner.nextLine();
        }
        forceBook.forEach((k, v) -> {
            if (v.size() != 0) {
                System.out.printf("Side: %s, Members: %d%n", k, v.size());
                v.forEach(user -> System.out.printf("! %s%n", user));
            }
        });
    }
}
