package Repository;

import Modals.Aliments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("AlimentsRepository")
public class AlimentsRepository extends JpaRepository<Aliments, Integer> {


}
