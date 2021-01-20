package introduction10.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/home")
    public String greeting(@RequestParam(required = false, defaultValue = "") String name) {
        return name.equals("") ? "Hey!" : "Hey, " + name + "!";
    }

}
