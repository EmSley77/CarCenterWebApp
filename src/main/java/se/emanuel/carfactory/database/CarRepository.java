package se.emanuel.carfactory.database;
//Emanuel sleyman
//2024-03-19

import org.springframework.data.jpa.repository.JpaRepository;
import se.emanuel.carfactory.entity.Car;

import java.util.List;

public interface CarRepository extends JpaRepository<Car, String> {

List<Car> findCarByReg(String reg);
}
