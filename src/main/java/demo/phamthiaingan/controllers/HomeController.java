package demo.phamthiaingan.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/todo")
    public String todo() {
        return "todo";
    }
}
