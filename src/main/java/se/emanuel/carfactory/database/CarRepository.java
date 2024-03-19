package se.emanuel.carfactory.database;
//Emanuel sleyman
//2024-03-19
import org.springframework.data.jpa.repository.JpaRepository;
import se.emanuel.carfactory.entity.Car;

public interface CarRepository extends JpaRepository<Car,String> {
}
