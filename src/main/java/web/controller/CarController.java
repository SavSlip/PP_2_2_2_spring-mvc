package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.List;

@Controller
public class CarController {
    @Autowired
    private CarService carService;

    @GetMapping(value = "/cars")
    public String getCars(@RequestParam(value = "count", required = false) Integer count, Model model) {
        List<Car> resultingCarList = carService.getCar(count);
        String pageTitle = carService.getPageTitle(resultingCarList.isEmpty());
        model.addAttribute("message", pageTitle);
        model.addAttribute("carList", resultingCarList);
        return "car";
    }


}
