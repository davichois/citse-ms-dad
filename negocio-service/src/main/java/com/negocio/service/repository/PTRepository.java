package com.negocio.service.repository;

import com.negocio.service.entity.PersonaTaller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PTRepository extends JpaRepository<PersonaTaller, Integer> {
}
