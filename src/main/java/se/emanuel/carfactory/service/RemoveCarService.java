package se.emanuel.carfactory.service;
//2024-03-31
//Emanuel sleyman
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.emanuel.carfactory.database.CarRepository;
import se.emanuel.carfactory.entity.Car;

import java.util.List;

@Service
public class RemoveCarService {

    @Autowired
    CarRepository carRepository;

    public String removeCar(String carId) {
        List<Car> carslist = carRepository.findCarByReg(carId);
        if (!carslist.isEmpty() && carslist != null) {
            for (Car c: carslist) {
                if (c.getReg().equals(carId)) {
                    carRepository.delete(c);
                    return "Car successfully deleted";
                } else return "Registiration number not found!";
            }
        }
        return "Something went wrong";
    }
}
