package com.negocio.service.repository;

import com.negocio.service.entity.Proyecto_Lugar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PLRepository extends JpaRepository<Proyecto_Lugar,Integer> {
    /*
    * Proyecto Lugar Repository
    * */
}
