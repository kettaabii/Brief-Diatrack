package Repository;

import Modals.Prelevement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class PrelevementRepository extends JpaRepository<Prelevement, Integer> {

}
