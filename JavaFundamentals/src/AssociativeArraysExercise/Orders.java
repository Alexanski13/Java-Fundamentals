package AssociativeArraysExercise;

import java.util.*;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        Map<String, List<Double>> productPrices = new LinkedHashMap<>();

        while (!line.equals("buy")) {
            String[] data = line.split("\\s+");
            String name = data[0];
            double price = Double.parseDouble(data[1]);
            double quantity = Double.parseDouble(data[2]);
            double sum = price * quantity;
            if (productPrices.containsKey(name)) {
                productPrices.get(name).set(0, price);
                productPrices.get(name).set(1, productPrices.get(name).get(1) + quantity);
            } else {
                productPrices.put(name, new ArrayList<>());
                productPrices.get(name).add(price);
                productPrices.get(name).add(quantity);
            }
            line = scanner.nextLine();
        }
        productPrices.forEach((k, v) -> System.out.printf("%s -> %.2f%n", k, v.get(0) * v.get(1)));
    }
}
