package com.negocio.citse.service.serviceImp;

import com.negocio.citse.dao.ProyectoDao;
import com.negocio.citse.entity.LugarProyecto;
import com.negocio.citse.entity.Proyecto;
import com.negocio.citse.feignClients.DistritoFeignClient;
import com.negocio.citse.models.Distrito;
import com.negocio.citse.service.ProyectoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProyectoServiceImp implements ProyectoService {

    @Autowired
    private ProyectoDao repo;


    @Override
    @Transactional(readOnly = true)
    public List<Proyecto> findAll() {
        return repo.findAll();
    }

    @Override
    public Proyecto findById(Integer id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public Proyecto save(Proyecto proyecto) {
        return repo.save(proyecto);
    }
}
