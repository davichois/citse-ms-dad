package com.cuestionario.service.repository;

import com.cuestionario.service.entity.Cuestionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CuestionarioRepository extends JpaRepository<Cuestionario,Integer> {
    public Cuestionario findById();
}
