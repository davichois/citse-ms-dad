package com.ubigeo.service.serviceImp;

import com.ubigeo.service.entity.Departamento;
import com.ubigeo.service.repository.DepartamentoRepository;
import com.ubigeo.service.service.DepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartamentoServiceImp implements DepartamentoService {

    @Autowired
    private DepartamentoRepository departamentoRepository;


    @Override
    public List<Departamento> findAll() {
        return departamentoRepository.findAll();
    }

    @Override
    public Departamento findById(int idDepartamento) {
        return departamentoRepository.findById(idDepartamento).orElse(null);
    }

    @Override
    public Departamento save(Departamento departamento) {
        return departamentoRepository.save(departamento);
    }

    @Override
    public String delete(int idDepartamento) {
        boolean searchDepartamento = departamentoRepository.findById(idDepartamento).isPresent();
        if (searchDepartamento){
            departamentoRepository.deleteById(idDepartamento);
            return "Departamento eliminado";
        }

        return null;
    }
}
