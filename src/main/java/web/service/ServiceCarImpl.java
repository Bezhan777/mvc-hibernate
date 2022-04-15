package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ServiceCarImpl implements ServiceCar{
    public List<Car> getCarList(Integer count) {
        List<Car> cars = new ArrayList<>();
        {
            cars.add(new Car("LADA", 55555, "RED"));
            cars.add(new Car("BMW", 111111, "BLACK"));
            cars.add(new Car("AUDI", 222222, "GREEN"));
            cars.add(new Car("SUZUKI", 333333, "PINK"));
            cars.add(new Car("OPEL", 444444, "WHITE"));
        }
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
