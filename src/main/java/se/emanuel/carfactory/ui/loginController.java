package se.emanuel.carfactory.ui;
//2024-03-31
//Emanuel sleyman
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import se.emanuel.carfactory.service.LoginService;

import java.util.Objects;

@Controller
public class loginController {

    @Autowired
    LoginService loginService;

    @GetMapping("loginpage")
    public String loginPage() {
        return "redirect:/loginpage.html";
    }

    @PostMapping("login")
    public String login(@RequestParam String username, @RequestParam String password, Model model) {
        if (Objects.equals(loginService.login(username, password), "successfully logged in")) {
            return "carpage";
        } else {
            return "redirect:/loginpage.html";
        }

    }
}
