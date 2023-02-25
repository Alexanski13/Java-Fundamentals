package AssociativeArraysExercise;

import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        Map<String, List<String>> courses = new LinkedHashMap<>();

        while (!line.equals("end")) {
            String[] data = line.split(" : ");
            String course = data[0];
            String studentName = data[1];
            courses.putIfAbsent(course, new ArrayList<>());
            courses.get(course).add(studentName);

            line = scanner.nextLine();
        }
        courses.entrySet().forEach(entry -> {
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue().size());
            entry.getValue().stream().
                    forEach(e -> System.out.printf("-- %s%n", e));
        });
    }
}
