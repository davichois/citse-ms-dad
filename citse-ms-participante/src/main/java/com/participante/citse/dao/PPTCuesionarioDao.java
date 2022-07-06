package com.participante.citse.dao;

import com.participante.citse.entity.PPTCuestionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PPTCuesionarioDao extends JpaRepository<PPTCuestionario,Integer> {
}
