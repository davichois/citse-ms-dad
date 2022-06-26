package com.negocio.service.serviceImp;

import com.negocio.service.entity.Programa;
import com.negocio.service.repository.ProgramaRepository;
import com.negocio.service.service.ProgramaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgramaServiceImp implements ProgramaService {

    @Autowired
    private ProgramaRepository programaRepository;


    @Override
    public List<Programa> findAll() {
        return programaRepository.findAll();
    }

    @Override
    public Programa findById(int id_programa) {
        return programaRepository.findById(id_programa).orElse(null);
    }

    @Override
    public Programa deleteById(int id_programa) {
        Programa programaState = findById(id_programa);
        programaState.setEsPrograma(false);
        programaRepository.save(programaState);
        return programaState;
    }
}
