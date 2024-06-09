package com.config.Service;
import com.config.Modals.Medicament;
import com.config.Repository.MedicamentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MedicamentService {
    @Autowired
    private MedicamentRepository medicamentRepository;
    public List<Medicament> getAllMedicaments() {
        return medicamentRepository.findAll();
    }
    public Medicament updateMedicament(Medicament medicament) {
        Medicament existingMedicament = medicamentRepository.findById(medicament.getIdMedicament()).orElse(null);
        if (existingMedicament != null) {
            int dosesTaken = existingMedicament.getDosesPrise();
            existingMedicament.setDosesPrise(dosesTaken + 1);
            return medicamentRepository.save(existingMedicament);
        }else {return null;}

    }
    public Medicament getMedicament(int idMedicament) {
        return medicamentRepository.findById(idMedicament).orElse(null);

    }
    public void resetDosesForNextDay() {

        List<Medicament> medicaments = medicamentRepository.findAll();


        for (Medicament medicament : medicaments) {
            medicament.setDosesPrise(0);
            // Save the updated medicament to the database
            medicamentRepository.save(medicament);
        }
    }
}