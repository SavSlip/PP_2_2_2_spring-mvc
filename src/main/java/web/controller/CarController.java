package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    private final List<Car> carList;

    {
        carList = new ArrayList<>();
        carList.add(new Car("Car1", "Red1", 2001));
        carList.add(new Car("Car2", "Red2", 2002));
        carList.add(new Car("Car3", "Red3", 2003));
        carList.add(new Car("Car4", "Red4", 2004));
        carList.add(new Car("Car5", "Red5", 2005));
    }

    @GetMapping(value = "/cars")
    public String getCars(@RequestParam(value = "count", required = false) Integer count, Model model ) {
        List<Car> resultingCarList = new ArrayList<>();
        String foundMessage;

        if (count == null || count >= 5){
            resultingCarList = carList;
        } else {
            for (int i = 0; i < count; i++) {
                resultingCarList.add(carList.get(i));
            }
        }

        if (resultingCarList.isEmpty()) {
            foundMessage = "Not found cars";
            model.addAttribute("message", foundMessage);
        } else {
            foundMessage = "List of cars";
            model.addAttribute("message", foundMessage);
        }
        model.addAttribute("carList",resultingCarList);
        return "car";
    }


}
