package Service;

import Modals.Prelevement;

import java.sql.Date;
import java.util.List;

public interface PrelevementService {
public Prelevement addPrelevement(Prelevement prelevement);
public List<Prelevement> getAllPrelevements();
public void deletePrelevement(int prelevementId);
public List<Prelevement> getListOfPrelevementsbyPeriod(Date StartDate, Date EndDate);
}
