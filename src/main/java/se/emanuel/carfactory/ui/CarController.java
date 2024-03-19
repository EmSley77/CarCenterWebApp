package se.emanuel.carfactory.ui;
//Emanuel sleyman
//2024-03-19
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import se.emanuel.carfactory.service.CarService;

@Controller
public class CarController {

    @Autowired
    CarService service;
    @GetMapping("car")
    public String getSite(Model model){
        model.addAttribute("carsite", "");

        return "carpage";
    }

    @PostMapping("registercar")
    public String registerCar(@RequestParam String reg, @RequestParam String brand,
                              @RequestParam String model,@RequestParam String color,
                              @RequestParam int year,
                              Model m) {

        String car = service.addCar(reg,brand,model,color,year);
        m.addAttribute("addcar", car);
        return "carpage";
    }

    @GetMapping("getcars")
    public String getCars(Model model) {
        model.addAttribute("allcars", service.allCars());
        return "carpage";
    }

    @PostMapping("removecar")
    public String removeCar(@RequestParam String reg, Model model) {
        model.addAttribute("removal", service.removeCar(reg));
        return "carpage";
    }
}
