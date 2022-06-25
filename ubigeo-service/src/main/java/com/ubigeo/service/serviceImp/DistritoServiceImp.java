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
    private DistritoRepository distritoRepository;


    @Override
    public List<Distrito> findAll() {
        return distritoRepository.findAll();
    }

    @Override
    public Distrito findById(int idDistrito) {
        return distritoRepository.findById(idDistrito).orElse(null);
    }

    @Override
    public Distrito save(Distrito distrito) {
        return distritoRepository.save(distrito);
    }

    @Override
    public String delete(int idDistrito) {
        boolean searchDepartamento = distritoRepository.findById(idDistrito).isPresent();
        if (searchDepartamento){
            distritoRepository.deleteById(idDistrito);
            return "Distrito eliminado";
        }

        return null;
    }
}
