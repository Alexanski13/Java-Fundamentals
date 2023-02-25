package ObjectsAndClassesExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Student> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] info = scanner.nextLine().split("\\s+");
            Student student = new Student(info[0], info[1], Double.parseDouble(info[2]));
            students.add(student);
        }
        students.stream()
                .sorted((p1, p2) -> Double.compare(p2.grade, p1.grade))
                .forEach(s -> System.out.println(s.toString()));
    }


    static class Student {
        String firstName;
        String secondName;
        double grade;

        public Student(String firstName, String secondName, double grade) {
            this.firstName = firstName;
            this.secondName = secondName;
            this.grade = grade;
        }
        @Override
        public String toString() {
            return String.format("%s %s: %.2f", this.firstName, this.secondName, this.grade);
        }
    }
}
