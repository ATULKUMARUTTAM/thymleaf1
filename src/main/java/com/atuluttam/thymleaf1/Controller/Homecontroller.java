package com.atuluttam.thymleaf1.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class Homecontroller {
    @GetMapping("/")
    public String function(Model model)
    {
        model.addAttribute("name","Atul Kumar uttam");
        return "home";
    }
}
