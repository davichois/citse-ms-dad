package com.ubigeo.service.repository;

import com.ubigeo.service.entity.Distrito;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DistritoRepository extends JpaRepository<Distrito,Integer> {

    public Distrito findById();
    /*
    @Query("SELECT d FROM TAX_DISTRITOS d WHERE(no_distrito LIKE %:query% or id_distrito LIKE %:query%)")
    List<Distrito> findAll(String query, Sort sort);

    @Query("SELECT d FROM TAX_DISTRITOS d WHERE(no_distrito LIKE %:query% or id_distrito LIKE %:query%)")
    Page<Distrito> findAllParams(String query, Pageable pg);
     */
}
