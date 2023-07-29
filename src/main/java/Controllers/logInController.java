package Controllers;

import Models.User;
import Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping
public class logInController {
    @Autowired(required = true)
    private UserRepository userRepo;
    @GetMapping("/login")
    public String landLoginPage(Model model){
        model.addAttribute("User", new User());
        return "logIn1";
    }
}
