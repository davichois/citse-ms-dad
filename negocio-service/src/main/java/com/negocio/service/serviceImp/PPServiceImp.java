package com.negocio.service.serviceImp;

import com.negocio.service.entity.PersonaPrograma;
import com.negocio.service.repository.PPRepository;
import com.negocio.service.service.PersonaProgramaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PPServiceImp implements PersonaProgramaService {

    @Autowired
    private PPRepository ppRepository;


    @Override
    public List<PersonaPrograma> findAll() {
        return ppRepository.findAll();
    }

    @Override
    public PersonaPrograma findById(int id_persona_programa) {
        return ppRepository.findById(id_persona_programa).orElse(null);
    }

}
