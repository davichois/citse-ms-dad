package com.cuestionario.citse.dao;

import com.cuestionario.citse.entity.Cuestionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CuestionarioRepository extends JpaRepository<Cuestionario, Integer> {
}
