package com.config.Repository;

import com.config.Modals.Prelevement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrelevementRepository extends JpaRepository<Prelevement, Integer> {

}
