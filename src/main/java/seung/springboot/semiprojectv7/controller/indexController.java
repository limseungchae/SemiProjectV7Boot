package seung.springboot.semiprojectv7.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/intro")
    public String intro() {
        return "intro";
    }

    @GetMapping("/admin")
    public String admin() {
        return "admin";
    }
}