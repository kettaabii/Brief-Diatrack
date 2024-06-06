package com.config.Controller;
 import com.config.Modals.Prelevement;
 import com.config.Service.PrelevementService;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Controller;
 import org.springframework.ui.Model;
 import org.springframework.web.bind.annotation.GetMapping;
 import org.springframework.web.bind.annotation.ModelAttribute;
 import org.springframework.web.bind.annotation.PostMapping;
 import org.springframework.web.bind.annotation.RequestMapping;



@RequestMapping("/")
@Controller
public class PrelevementController {

    @Autowired
    private PrelevementService prelevementService;

    @GetMapping("/")
    public String index() {
        return "views/index";
    }
    @GetMapping("/newTest")
    public String newTest(Model model) {
        Prelevement prelevement = new Prelevement();
        model.addAttribute("prelevement", prelevement);
        return "views/prelevement";
    }
    @PostMapping("/save-prelevement")
    public String AddPrelevement(@ModelAttribute("prelevement") Prelevement prelevement) {
      prelevementService.addPrelevement(prelevement);
        return "redirect:/";
    }

}
