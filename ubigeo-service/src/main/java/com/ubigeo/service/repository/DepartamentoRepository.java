package com.ubigeo.service.repository;

import com.ubigeo.service.entity.Departamento;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartamentoRepository extends JpaRepository<Departamento,Integer> {

    public Departamento findById();
/*
    @Query("SELECT d FROM TAX_DEPARTAMENTOS d WHERE(no_departamento LIKE %:query% or id_departamento LIKE %:query%)")
    List<Departamento> findAll(String query, Sort sort);

    @Query("SELECT d FROM TAX_DEPARTAMENTOS d WHERE(no_departamento LIKE %:query% or id_departamento LIKE %:query%)")
    Page<Departamento> findAllParams(String query, Pageable pg);
 */
}