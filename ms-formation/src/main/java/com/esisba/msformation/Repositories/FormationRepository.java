package com.esisba.msformation.Repositories;

import com.esisba.msformation.Entities.Formation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FormationRepository extends JpaRepository<Formation, Long> {
}
