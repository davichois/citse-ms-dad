package com.ubigeo.service.serviceImp;

import com.ubigeo.service.entity.Provincia;
import com.ubigeo.service.repository.ProvinciaRepository;
import com.ubigeo.service.service.ProvinciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ProvinciaServiceImp implements ProvinciaService {

    @Autowired
    private ProvinciaRepository repo;

    @Override
    public Map<String,Object> findAll() {
        Map<String,Object> results = new HashMap<>();

        results.put("error", false);
        if(!repo.findAll().isEmpty()){
            results.put("body",repo.findAll());
        }else{
            results.put("body",null);
        }
        return results;
    }

    @Override
    public Provincia findById(int id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public Provincia save(Provincia provincia) {
        return repo.save(provincia);
    }

    @Override
    public void delete(Provincia provincia) {
        repo.delete(provincia);
    }
}
