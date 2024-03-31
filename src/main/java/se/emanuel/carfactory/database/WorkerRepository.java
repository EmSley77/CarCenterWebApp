package se.emanuel.carfactory.database;
//2024-03-31
//Emanuel sleyman
import org.springframework.data.jpa.repository.JpaRepository;
import se.emanuel.carfactory.entity.Worker;

import java.util.List;

public interface WorkerRepository extends JpaRepository<Worker, Integer> {
    List<Worker> findByUsernameAndPassword(String username, String password);
}
