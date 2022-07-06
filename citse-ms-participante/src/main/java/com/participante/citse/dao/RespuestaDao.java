package com.participante.citse.dao;

import com.participante.citse.entity.Respuesta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RespuestaDao extends JpaRepository<Respuesta,Integer> {
}
