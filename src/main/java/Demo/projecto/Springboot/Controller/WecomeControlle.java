package Demo.projecto.Springboot.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WecomeControlle {
    @GetMapping
    public String welcome(){
        return "Welcome to my spring boot web API";
    }
}
