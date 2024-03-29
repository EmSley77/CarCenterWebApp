package se.emanuel.carfactory.service;
//Emanuel sleyman
//2024-03-19
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;
import se.emanuel.carfactory.database.CarRepository;
import se.emanuel.carfactory.entity.Car;

import java.util.List;
import java.util.Optional;

@Service
@SessionScope
public class CarService {

    @Autowired
    CarRepository repo;

    public List<Car> allCars() {
        return repo.findAll();
    }

    public String addCar(String reg, String brand, String model, String color, int year) {
        Car car = new Car();

        car.setReg(reg);
        car.setBrand(brand);
        car.setModel(model);
        car.setColor(color);
        car.setYear(year);

        if (!repo.existsById(reg)) {
            repo.save(car);
            return "Successfully saved into database";
        }
        else {
            return "cannot save in database, reg already exists, try another vaild regnumber!";
        }
    }

    public String removeCar(String reg ){
        Optional<Car> car = repo.findById(reg);
        if (car.isPresent()) {
            repo.deleteById(reg);
            return "Car successfully been removed";

        } else return "You entered a non existent registration!, try again";
    }
}
