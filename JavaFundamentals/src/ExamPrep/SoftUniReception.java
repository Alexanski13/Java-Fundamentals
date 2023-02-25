package ExamPrep;

import java.util.Scanner;

public class SoftUniReception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int employee1 = Integer.parseInt(scanner.nextLine());
        int employee2 = Integer.parseInt(scanner.nextLine());
        int employee3 = Integer.parseInt(scanner.nextLine());

        int totalHandle = employee1 + employee2 + employee3;

        int studentsCount = Integer.parseInt(scanner.nextLine());
        int timeNeeded = 0;


        while (studentsCount > 0) {
            studentsCount -= totalHandle;
            timeNeeded++;

            if (timeNeeded % 4 == 0) {
                timeNeeded++;
            }
        }
        System.out.printf("Time needed: %dh.", timeNeeded);
    }
}
