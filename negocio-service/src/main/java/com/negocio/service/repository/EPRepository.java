package com.negocio.service.repository;

import com.negocio.service.entity.EntidadProyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EPRepository extends JpaRepository<EntidadProyecto,Integer> {
    /*
    * ENTIDAD_PROYECTO REPOSITORY
    * */
}
