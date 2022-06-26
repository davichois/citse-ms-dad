package com.negocio.service.serviceImp;

import com.negocio.service.entity.Taller;
import com.negocio.service.repository.TallerRepository;
import com.negocio.service.service.TallerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TallerServiceImp implements TallerService {

    @Autowired
    private TallerRepository tallerRepository;


    @Override
    public List<Taller> findAll() {
        return tallerRepository.findAll();
    }

    @Override
    public Taller findById(int id_taller) {
        return tallerRepository.findById(id_taller).orElse(null);
    }

    @Override
    public Taller deleteById(int id_taller) {
        Taller tallerState = findById(id_taller);
        tallerState.setEsTaller(false);
        tallerRepository.save(tallerState);
        return tallerState;
    }
}
