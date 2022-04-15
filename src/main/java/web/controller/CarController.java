package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.ServiceCar;
import web.service.ServiceCarImpl;

import java.util.List;

@Controller
public class CarController {
@GetMapping("/cars")
    public String carList(@RequestParam (defaultValue = "5") Integer count, ModelMap model){
    ServiceCar serviceCar = new ServiceCarImpl();
    List<Car> list = serviceCar.getCarList(count);
    model.addAttribute("cars",list);
     return "cars";
}
}
