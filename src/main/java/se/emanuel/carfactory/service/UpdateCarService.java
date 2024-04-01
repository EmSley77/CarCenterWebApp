package se.emanuel.carfactory.service;
//Emanuel sleyman
//2024-04-01

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.emanuel.carfactory.database.CarRepository;
import se.emanuel.carfactory.entity.Car;

import java.util.List;

@Service
public class UpdateCarService {

    @Autowired
    CarRepository repository;

    public String updateCarPrice(String reg, int newPrice) {
        List<Car> car = repository.findCarByReg(reg);
        if (car.isEmpty()) {
            return "Could not find car";
        }

        for (Car c: car) {
            c.setCost(newPrice);
        }
        return "Price has been updated!";
    }
}
