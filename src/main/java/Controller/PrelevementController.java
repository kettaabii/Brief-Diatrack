package Controller;
 import org.springframework.web.bind.annotation.GetMapping;
 import org.springframework.web.bind.annotation.RequestMapping;


@org.springframework.stereotype.Controller
@RequestMapping("/")
public class PrelevementController {
    @GetMapping("/")
    public String index() {
        return "views/index";
    }

}
