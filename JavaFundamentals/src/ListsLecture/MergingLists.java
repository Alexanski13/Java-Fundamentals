package ListsLecture;

import java.util.*;
import java.util.stream.Collectors;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> line1 = (Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList()));
        List<Integer> line2 = (Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList()));

        List<Integer> resultNum = new ArrayList<>();

        for (int i = 0; i < Math.min(line1.size(), line2.size()); i++) {
            resultNum.add(line1.get(i));
            resultNum.add(line2.get(i));
        }
        if (line1.size() > line2.size()) {
            resultNum.addAll(getRemainingElements(line1, line2));
        } else if (line2.size() > line1.size()) {
            resultNum.addAll(getRemainingElements(line2, line1));
        }
        System.out.println(resultNum.toString().replaceAll("[\\[\\],]", ""));
    }

    private static List<Integer> getRemainingElements(List<Integer> longerList, List<Integer> shorterList) {
        List<Integer> nums = new ArrayList<>();
        for (int i = shorterList.size(); i < longerList.size(); i++) {
            nums.add((longerList.get(i)));
        }
        return nums;
    }
}
