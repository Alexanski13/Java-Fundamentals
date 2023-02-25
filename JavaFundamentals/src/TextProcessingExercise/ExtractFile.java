package TextProcessingExercise;

import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String filepath = scanner.nextLine();

        String fileName = filepath.substring(filepath.lastIndexOf("\\") + 1, filepath.indexOf("."));
        String fileExtension = filepath.substring(filepath.lastIndexOf(".") + 1);
        System.out.println("File name: " + fileName);
        System.out.println("File extension: " + fileExtension);

    }
}