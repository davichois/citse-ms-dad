package com.tipo.service.serviceImp;

import com.tipo.service.entity.Familia;
import com.tipo.service.repository.FamiliaRepository;
import com.tipo.service.service.FamiliaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FamiliaServiceImp implements FamiliaService {

    @Autowired
    private FamiliaRepository familiaRepository;



    @Override
    public List<Familia> findAll() {
        return familiaRepository.findAll();
    }

    @Override
    public Familia findById(int id_familia) {
        return familiaRepository.findById(id_familia).orElseThrow();
    }
}
