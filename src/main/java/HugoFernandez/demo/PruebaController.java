package HugoFernandez.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PruebaController {

    @GetMapping("/saludo")
    public String saludar() {
        return "✅ Backend desplegado con éxito en AWS ECS por Hugo Fernandez.";
    }
}