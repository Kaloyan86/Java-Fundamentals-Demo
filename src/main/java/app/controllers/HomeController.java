package app.controllers;

import java.util.ArrayList;
import java.util.List;

import app.models.Car;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @ResponseBody
    @RequestMapping("/home")
    public String home() {
        return "<h1>Hello MyApp!<h1>";
    }

    @GetMapping("/cars")
    public ModelAndView car(ModelAndView modelAndView) {

        Car car1 = new Car("OPEL", "ASTRA", "5800");
        Car car2 = new Car("BMW", "328i", "8800");
        Car car3 = new Car("MAZDA", "6", "7800");

        List<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);

        modelAndView.setViewName("index");
        modelAndView.addObject("cars", cars);

        return modelAndView;
    }
}
