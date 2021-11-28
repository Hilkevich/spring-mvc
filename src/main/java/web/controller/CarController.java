package web.controller;

import model.Car;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarService;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping("/cars")
    public String printCars(@RequestParam(value = "count", defaultValue = "5") int count, Model model) {

        List<Car> listCars = new ArrayList<>();

        listCars.add(new Car("BMW", 320, "white"));
        listCars.add(new Car("Mazda", 3, "blue"));
        listCars.add(new Car("Audi", 80, "grey"));
        listCars.add(new Car("Volga", 21, "black"));
        listCars.add(new Car("Ferrari", 250, "red"));

        listCars = CarService.carsCount(listCars, count);
        model.addAttribute("listCars", listCars);

        return "cars";
    }
}
