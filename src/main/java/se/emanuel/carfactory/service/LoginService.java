package se.emanuel.carfactory.service;
//2024-03-31
//Emanuel sleyman
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;
import se.emanuel.carfactory.database.WorkerRepository;
import se.emanuel.carfactory.entity.Worker;

import java.util.List;

@Service
@SessionScope
public class LoginService {

    public enum login{
        LOGIN_SUCCESS,
        LOGIN_FAILED
    }

    @Autowired
    WorkerRepository workerRepository;

    public String login(String username, String password) {
        List<Worker> work = workerRepository.findByUsernameAndPassword(username, password);
        for (Worker w : work) {
            if (w.getUsername().equalsIgnoreCase(username) && w.getPassword().equalsIgnoreCase(password)) {
                return "successfully logged in";
            } else return "wrong login details";
        }
        return "something went wrong";
    }
}
