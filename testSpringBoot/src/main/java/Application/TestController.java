package Application;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class TestController {
    @RequestMapping("/app")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}