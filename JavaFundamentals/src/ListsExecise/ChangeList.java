package ListsExecise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] data = command.split("\\s+");
            String commands = data[0];
            switch (commands) {
                case "Delete":
                    int element = Integer.parseInt(data[1]);
                    for (int i = 0; i <numbers.size() ; i++) {
                        if (numbers.get(i) == element) {
                            numbers.remove(i);
                            i--;
                        }
                    }
                    break;
                case "Insert":
                    element = Integer.parseInt(data[1]);
                    int position = Integer.parseInt(data[2]);
                    numbers.add(position, element);
                    break;
            }
            command = scanner.nextLine();
        }
        numbers.forEach(e-> System.out.print(e + " "));
    }
}
