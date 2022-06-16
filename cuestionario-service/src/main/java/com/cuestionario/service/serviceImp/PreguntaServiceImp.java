package com.cuestionario.service.serviceImp;

import com.cuestionario.service.entity.Pregunta;
import com.cuestionario.service.repository.PreguntaRepository;
import com.cuestionario.service.service.PreguntaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class PreguntaServiceImp implements PreguntaService {

    @Autowired
    private PreguntaRepository repo;

    @Override
    public Map<String, Object> findAll() {
        Map<String,Object> results = new HashMap<>();

        results.put("error",false);
        if(!repo.findAll().isEmpty()){
            results.put("body",repo.findAll());
        }else{
            results.put("body",null);
        }
        return results;
    }

    @Override
    public Pregunta findById(int id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public Pregunta save(Pregunta pregunta) {
        return repo.save(pregunta);
    }
}
