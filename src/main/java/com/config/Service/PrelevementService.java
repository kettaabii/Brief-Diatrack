
package com.config.Service;

import com.config.Modals.Prelevement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.config.Repository.PrelevementRepository;

import java.time.LocalDate;
import java.util.List;

@Service
public class PrelevementService {

    @Autowired
    private PrelevementRepository prelevementRepository;


    public Prelevement addPrelevement(Prelevement prelevement) {

        prelevementRepository.save(prelevement);
        return prelevement;
    }


    public List<Prelevement> getAllPrelevements() {
        return prelevementRepository.findAll();
    }


    public void deletePrelevement(int prelevementId) {
      prelevementRepository.deleteById(prelevementId);
    }


    public List<Prelevement> getListOfPrelevementsbyPeriod(LocalDate StartDate, LocalDate EndDate) {
        return null;
    }
}
