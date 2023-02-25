package RegularExpressionsExercise;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> products = new LinkedList<>();

        String regex = "[>]{2}(?<name>[\\w]+)[<]{2}(?<price>[\\d.]+)!(?<quantity>[\\d]+)";
        String text = scanner.nextLine();

        Pattern pattern = Pattern.compile(regex);
        double totalSum = 0;

        while (!text.equals("Purchase")) {
            Matcher matcher = pattern.matcher(text);
            while (matcher.find()) {
                String name = matcher.group("name");
                double price = Double.parseDouble(matcher.group("price"));
                double quantity = Double.parseDouble(matcher.group("quantity"));
                products.add(name);
                totalSum += price * quantity;
            }

            text = scanner.nextLine();
        }
        System.out.println("Bought furniture:");
        products.forEach(System.out::println);
        System.out.printf("Total money spend: %.2f", totalSum);
    }
}