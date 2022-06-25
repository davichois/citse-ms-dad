package com.negocio.service.serviceImp;

import com.negocio.service.entity.PersonaTaller;
import com.negocio.service.repository.PTRepository;
import com.negocio.service.service.PersonaTallerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PTServiceImp implements PersonaTallerService {

    @Autowired
    private PTRepository ptRepository;


    @Override
    public List<PersonaTaller> findAll() {
        return ptRepository.findAll();
    }

    @Override
    public PersonaTaller findById(int id_persona_taller) {
        return ptRepository.findById(id_persona_taller).orElse(null);
    }

    @Override
    public PersonaTaller deleteById(int id_persona_taller) {
        PersonaTaller PTestado= findById(id_persona_taller);
        PTestado.setEsAsistencia(false);
        ptRepository.save(PTestado);
        return PTestado;
    }

}
