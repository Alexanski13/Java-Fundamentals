package AssociativeArraysExercise;

import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        Map<String, List<String>> companyUsers = new LinkedHashMap<>();

        while (!line.equals("End")) {
            String[] data = line.split(" -> ");
            String companyName = data[0];
            String employeeID = data[1];
            companyUsers.putIfAbsent(companyName, new ArrayList<>());
            if (!companyUsers.get(companyName).contains(employeeID)) {
                companyUsers.get(companyName).add(employeeID);
            }

            line = scanner.nextLine();
        }
        companyUsers.forEach((key, value) -> {
            System.out.printf("%s%n", key);
            value.stream().
                    forEach(e -> System.out.printf("-- %s%n", e));
        });
    }
}
