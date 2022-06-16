package com.ubigeo.service.serviceImp;

import com.ubigeo.service.entity.Distrito;
import com.ubigeo.service.repository.DistritoRepository;
import com.ubigeo.service.service.DistritoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DistritoServiceImp implements DistritoService {

    @Autowired
    private DistritoRepository repo;

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
    public Distrito findById(int id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public Distrito save(Distrito distrito) {
        return repo.save(distrito);
    }

    @Override
    public void delete(Distrito distrito) {
        repo.delete(distrito);
    }
}
