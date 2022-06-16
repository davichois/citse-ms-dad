package com.cuestionario.service.serviceImp;

import com.cuestionario.service.entity.Cuestionario;
import com.cuestionario.service.repository.CuestionarioRepository;
import com.cuestionario.service.service.CuestionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class CuestionarioServiceImp implements CuestionarioService {

    @Autowired
    private CuestionarioRepository repo;

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
    public Cuestionario findById(int Id) {
        return repo.findById(Id).orElse(null);
    }

    @Override
    public Cuestionario save(Cuestionario cuestionario) {
        return repo.save(cuestionario);
    }

    @Override
    public void delete(Cuestionario cuestionario) {
        repo.delete(cuestionario);
    }
}
