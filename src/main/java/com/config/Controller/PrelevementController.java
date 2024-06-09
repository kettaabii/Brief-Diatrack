package com.config.Controller;
 import com.config.Modals.Medicament;
 import com.config.Modals.Prelevement;

 import com.config.Service.MedicamentService;
 import com.config.Service.PrelevementService;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.format.annotation.DateTimeFormat;
 import org.springframework.stereotype.Controller;
 import org.springframework.ui.Model;
 import org.springframework.web.bind.annotation.*;

 import java.time.LocalDateTime;
 import java.time.format.DateTimeFormatter;


@RequestMapping("/")
@Controller
public class PrelevementController {

    @Autowired
    private PrelevementService prelevementService;
    @Autowired
    private MedicamentService medicamentService;
    @GetMapping("/")
    public String index() {
        return "views/index";
    }
    @GetMapping("/newTest")
    public String newTest(Model model) {
        Prelevement prelevement = new Prelevement();
        model.addAttribute("prelevement", prelevement);
        model.addAttribute("medicalisation",medicamentService.getAllMedicaments());
        System.out.println(medicamentService.getAllMedicaments());
        return "views/prelevement";
    }
    @PostMapping("/save-prelevement")
    public String AddPrelevement(@RequestParam("niveauGlicemique") Double niveau, @RequestParam("datePrelevement") LocalDateTime datePrelevement, @RequestParam("range") String range, Prelevement prelevement) {
        Prelevement.RangeGlicemie rangeGlicemie = Prelevement.RangeGlicemie.valueOf(range);
        prelevement = new Prelevement(niveau, datePrelevement, rangeGlicemie);
        prelevementService.addPrelevement(prelevement);
        return "redirect:/";
    }
    @PostMapping("/incrementDoses")
    public String incrementDoses(@RequestParam("medicamentId") int medicamentId) {
       Medicament medicament = medicamentService.getMedicament(medicamentId);
        medicamentService.updateMedicament(medicament);
        return "redirect:/newTest";
    }

}
