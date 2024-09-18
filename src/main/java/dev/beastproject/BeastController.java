package dev.beastproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BeastController {

    @GetMapping("/")
    public String home() {
        return "home";
    }

}
