package com.ubigeo.service.serviceImp;

import com.ubigeo.service.entity.Provincia;
import com.ubigeo.service.repository.ProvinciaRepository;
import com.ubigeo.service.service.ProvinciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProvinciaServiceImp implements ProvinciaService {

    @Autowired
    private ProvinciaRepository provinciaRepository;


    @Override
    public List<Provincia> findAll() {
        return provinciaRepository.findAll();
    }

    @Override
    public Provincia findById(int idProvincia) {
        return provinciaRepository.findById(idProvincia).orElse(null);
    }

    @Override
    public Provincia save(Provincia provincia) {
        return provinciaRepository.save(provincia);
    }

    @Override
    public String delete(int idProvincia) {
        boolean searchDepartamento = provinciaRepository.findById(idProvincia).isPresent();
        if (searchDepartamento){
            provinciaRepository.deleteById(idProvincia);
            return "Distrito eliminado";
        }

        return null;
    }

}
