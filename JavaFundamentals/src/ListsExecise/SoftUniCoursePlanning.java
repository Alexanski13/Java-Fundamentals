package ListsExecise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> initialSchedule = Arrays.stream(scanner.nextLine()
                        .split(", "))
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("course start")) {
            String[] data = input.split(":");
            String command = data[0];
            String lessonTitle = data[1];
            switch (command) {
                case "Add":
                    if (!initialSchedule.contains(lessonTitle)) {
                        initialSchedule.add(lessonTitle);
                    }
                    break;
                case "Insert":
                    int index = Integer.parseInt(data[2]);
                    if (!initialSchedule.contains(lessonTitle)) {
                        if (index >= 0 && index < initialSchedule.size()) {
                            initialSchedule.add(index, lessonTitle);
                        }
                    }
                    break;
                case "Remove":
                    initialSchedule.remove(lessonTitle);
                    initialSchedule.remove(lessonTitle + "-Exercise");
                    break;
                case "Swap":
                    String secondLessonTitle = data[2];
                    String firstLessonEx = lessonTitle + "-Exercise";
                    String secondLessonEx = secondLessonTitle + "-Exercise";
                    if (initialSchedule.contains(lessonTitle) && initialSchedule.contains(secondLessonTitle)) {
                        int firstIndex = initialSchedule.indexOf(lessonTitle);
                        int secondIndex = initialSchedule.indexOf(secondLessonTitle);
                        initialSchedule.add(secondIndex, lessonTitle);
                        initialSchedule.remove(secondLessonTitle);
                        initialSchedule.remove(lessonTitle);
                        initialSchedule.add(firstIndex, secondLessonTitle);
                    }
                    if (initialSchedule.contains(firstLessonEx)) {
                        initialSchedule.remove(firstLessonEx);
                        initialSchedule.add(initialSchedule.indexOf(lessonTitle) + 1, firstLessonEx);
                    }
                    if (initialSchedule.contains(secondLessonEx)) {
                        initialSchedule.remove(secondLessonEx);
                        initialSchedule.add(initialSchedule.indexOf(secondLessonTitle) + 1, secondLessonEx);
                    }
                    break;
                case "Exercise":
                    String exercise = lessonTitle + "-Exercise";
                    if (initialSchedule.contains(lessonTitle) && !initialSchedule.contains(exercise)) {
                        initialSchedule.add(initialSchedule.indexOf(lessonTitle) + 1, exercise);
                    } else if (!initialSchedule.contains(lessonTitle)) {
                        initialSchedule.add(lessonTitle);
                        initialSchedule.add(exercise);
                    }
                    break;

            }
            input = scanner.nextLine();
        }
        for (int i = 1; i <= initialSchedule.size(); i++) {
            System.out.printf("%d.%s%n", i, initialSchedule.get(i - 1));
        }
    }
}
