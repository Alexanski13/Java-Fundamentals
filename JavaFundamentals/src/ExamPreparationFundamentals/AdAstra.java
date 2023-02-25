package ExamPreparationFundamentals;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra {
    static class Food {
        String name;
        String date;
        int calories;

        public Food(String name, String date, int calories) {
            this.name = name;
            this.date = date;
            this.calories = calories;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public int getCalories() {
            return calories;
        }

        public void setCalories(int calories) {
            this.calories = calories;
        }

        @Override
        public String toString() {
            return String.format("Item: %s, Best before: %s, Nutrition: %d", this.name, this.date, this.calories);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String regex = "([|#])(?<name>[A-Za-z\\s]+)\\1(?<date>[\\d]{2}[\\/]{1}[\\d]{2}[\\/][\\d]{2})\\1(?<calories>[\\d]{1,5})\\1";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        List<Food> foodList = new LinkedList<>();

        while (matcher.find()) {
            String productName = matcher.group("name");
            String date = matcher.group("date");
            int calories = Integer.parseInt(matcher.group("calories"));
            Food food = new Food(productName, date, calories);
            foodList.add(food);
        }
        int days = foodList.stream().mapToInt(Food::getCalories).sum() / 2000;
        System.out.printf("You have food to last you for: %d days!%n", days);
        foodList.forEach(System.out::println);
    }
}
