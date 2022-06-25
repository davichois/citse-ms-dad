package com.negocio.service.repository;

import com.negocio.service.entity.ProyectoLugar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PLRepository extends JpaRepository<ProyectoLugar,Integer> {
    /*
    * Proyecto Lugar Repository
    * */
}
