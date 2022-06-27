package com.cuestionario.service.serviceImp;

import com.cuestionario.service.entity.Cuestionario;
import com.cuestionario.service.repository.CuestionarioRepository;
import com.cuestionario.service.service.CuestionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CuestionarioServiceImp implements CuestionarioService {

    @Autowired
    private CuestionarioRepository cuestionarioRepository;


    @Override
    public List<Cuestionario> findAll() {
        return cuestionarioRepository.findAll();
    }

    @Override
    public Cuestionario findById(int id_cuestionario) {
        return cuestionarioRepository.findById(id_cuestionario).orElse(null);
    }
}
