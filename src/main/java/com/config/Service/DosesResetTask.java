package com.config.Service;

import com.config.Service.MedicamentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class DosesResetTask {

    @Autowired
    private MedicamentService medicamentService;

    @Scheduled(cron = "0 * * * * *")
    public void resetDosesForNextDay() {
        // Call a method in the service layer to reset doses taken for all medicaments
        medicamentService.resetDosesForNextDay();
    }
}
