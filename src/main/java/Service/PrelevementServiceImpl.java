package Service;

import Modals.Prelevement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import Repository.PrelevementRepository;
import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
@Service
public class PrelevementServiceImpl implements PrelevementService {
    @Autowired
    private PrelevementRepository prelevementRepository;
    @Override
    public Prelevement addPrelevement(Prelevement prelevement) {

        prelevementRepository.save(prelevement);
        return prelevement;
    }

    @Override
    public List<Prelevement> getAllPrelevements() {
        return prelevementRepository.findAll();
    }

    @Override
    public void deletePrelevement(int prelevementId) {
      prelevementRepository.deleteById(prelevementId);
    }

    @Override
    public List<Prelevement> getListOfPrelevementsbyPeriod(LocalDate StartDate, LocalDate EndDate) {
        return null;
    }
}
