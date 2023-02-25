package ObjectsAndClassesExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class VehicleCatalogue {
    static class Vehicle {
        String type;
        String model;
        String color;
        int horsepower;

        public Vehicle(String type, String model, String color, int horsepower) {
            this.type = type;
            this.model = model;
            this.color = color;
            this.horsepower = horsepower;
        }

        public String getType() {
            return type;
        }

        public String getModel() {
            return model;
        }

        public String getColor() {
            return color;
        }

        public int getHorsepower() {
            return horsepower;
        }

        @Override
        public String toString() {
            return String.format("Type: %s%n" + "Model: %s%n" + "Color: %s%n" + "Horsepower: %d%n",
                    this.type.toUpperCase().charAt(0) + this.type.substring(1), this.model, this.color, this.horsepower);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Vehicle> vehicleList = new ArrayList<>();

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String[] data = input.split("\\s+");
            Vehicle vehicle = new Vehicle(data[0], data[1], data[2], Integer.parseInt(data[3]));
            vehicleList.add(vehicle);

            input = scanner.nextLine();
        }
        input = scanner.nextLine();

        while (!input.equals("Close the Catalogue")) {
            String model = input;

            vehicleList.stream().filter(vehicle -> vehicle.getModel().equals(model))
                    .forEach(vehicle -> System.out.print(vehicle.toString()));

            input = scanner.nextLine();
        }
        List<Vehicle> cars = vehicleList.stream().filter(vehicle -> vehicle.getType().equals("car"))
                .collect(Collectors.toList());
        List<Vehicle> trucks = vehicleList.stream().filter(vehicle -> vehicle.getType().equals("truck"))
                .collect(Collectors.toList());

        double carsAvgHP = cars.stream().mapToDouble(Vehicle::getHorsepower).sum() / cars.size();
        double trucksAvgHP = trucks.stream().mapToDouble(Vehicle::getHorsepower).sum() / trucks.size();
        if (!cars.isEmpty()) {
            System.out.printf("Cars have average horsepower of: %.2f.%n", carsAvgHP);
        } else {
            System.out.printf("Cars have average horsepower of: 0.00.%n");
        }
        if (!trucks.isEmpty()) {
            System.out.printf("Trucks have average horsepower of: %.2f.%n", trucksAvgHP);
        } else {
            System.out.printf("Trucks have average horsepower of: 0.00.%n");
        }
    }
}
