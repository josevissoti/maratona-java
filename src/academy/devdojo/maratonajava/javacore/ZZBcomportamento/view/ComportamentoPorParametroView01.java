package academy.devdojo.maratonajava.javacore.ZZBcomportamento.view;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroView01 {

    private static List<Car> cars = List.of(new Car("green", 2011), new Car("black", 1998), new Car("red", 2019));

    public static void main(String[] args) {
        System.out.println(filterGreenCar(cars));
        System.out.println(filterRedCar(cars));
        System.out.println(filterCarByColor(cars, "green"));
        System.out.println(filterCarByColor(cars, "red"));
        System.out.println("--------------------------");
        System.out.println(filterByYearBefore(cars, 2012));
    }

    private static List<Car> filterGreenCar(List<Car> cars) {
        List<Car> greenCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals("green")) {
                greenCars.add(car);
            }
        }
        return greenCars;
    }

    private static List<Car> filterRedCar(List<Car> cars) {
        List<Car> redCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals("red")) {
                redCars.add(car);
            }
        }
        return redCars;
    }

    private static List<Car> filterCarByColor(List<Car> cars, String color) {
        List<Car> carsByColor = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals(color)) {
                carsByColor.add(car);
            }
        }
        return carsByColor;
    }

    private static List<Car> filterByYearBefore(List<Car> cars, int year) {
        List<Car> oldCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getYear() < year) {
                oldCars.add(car);
            }
        }
        return oldCars;
    }
}
