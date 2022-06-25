package com.negocio.service.repository;

import com.negocio.service.entity.PersonaPrograma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PPRepository extends JpaRepository<PersonaPrograma, Integer> {
}
