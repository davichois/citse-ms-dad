package com.persona.service.serviceImp;

import com.persona.service.entity.Persona;
import com.persona.service.repository.PersonaRepository;
import com.persona.service.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImp implements PersonaService {

    @Autowired
    private PersonaRepository personaRepository;


    @Override
    public List<Persona> findAll() {
        return personaRepository.findAll();
    }

    @Override
    public Persona findById(int id_persona) {
        return personaRepository.findById(id_persona).orElseThrow();
    }

    @Override
    public Persona deleteById(int id_persona) {
        Persona personaState = findById(id_persona);
        personaState.setEs_persona(false);
        personaRepository.save(personaState);
        return personaState;
    }
}
