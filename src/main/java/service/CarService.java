package service;

import model.Car;
import java.util.List;
import java.util.stream.Collectors;

public class CarService {

    public static List<Car> carsCount(List<Car> listCars, int number) {
        if (number == 0 || number > 5) return listCars;
        return listCars.stream().limit(number).collect(Collectors.toList());
    }
}
