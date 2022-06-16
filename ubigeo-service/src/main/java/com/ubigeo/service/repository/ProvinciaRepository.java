package com.ubigeo.service.repository;

import com.ubigeo.service.entity.Provincia;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProvinciaRepository extends JpaRepository<Provincia,Integer> {

    public Provincia findById();
   /* @Query("SELECT d FROM TAX_PROVINCIAS d WHERE(NO_PROVINCIA LIKE %:query% or ID_PROVINCIA LIKE %:query%)")
    List<Provincia> findAll(String query, Sort sort);

    @Query("SELECT d FROM TAX_PROVINCIAS d WHERE(NO_PROVINCIA LIKE %:query% or ID_PROVINCIA LIKE %:query%)")
    Page<Provincia> findAllParams(String query, Pageable pg);
    */
}
