package com.maestra.service.repository;

import com.maestra.service.entity.Comunidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComunidadRepository extends JpaRepository<Comunidad, Integer> {
}
