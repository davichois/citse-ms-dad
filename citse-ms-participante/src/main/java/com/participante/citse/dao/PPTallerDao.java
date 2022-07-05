package com.participante.citse.dao;

import com.participante.citse.entity.PPTaller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PPTallerDao extends JpaRepository<PPTaller,Integer> {
}
