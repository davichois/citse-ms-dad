package com.ubigeo.service.serviceImp;

import com.ubigeo.service.entity.Departamento;
import com.ubigeo.service.repository.DepartamentoRepository;
import com.ubigeo.service.service.DepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DepartamentoServiceImp implements DepartamentoService {

    @Autowired
    private DepartamentoRepository repo;


    @Override
    public Map<String, Object> findAll() {
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
    public Departamento findById(int id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public Departamento save(Departamento departamento) {
        return repo.save(departamento);
    }

    @Override
    public void delete(Departamento departamento) {
        repo.delete(departamento);
    }
}
