package com.negocio.service.repository;

import com.negocio.service.entity.Entidad_Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EPRepository extends JpaRepository<Entidad_Proyecto,Integer> {
    /*
    * ENTIDAD_PROYECTO REPOSITORY
    * */
}
