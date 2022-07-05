package com.participante.citse.service.ServiceImp;

import com.participante.citse.dao.PPTallerDao;
import com.participante.citse.entity.PPTaller;
import com.participante.citse.service.PPTallerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PPTallerServiceImp implements PPTallerService {

    @Autowired
    private PPTallerDao repo;

    @Override
    public List<PPTaller> findAll() {
        return repo.findAll();
    }

    @Override
    public PPTaller findById(Integer id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public PPTaller save(PPTaller ppTaller) {
        return repo.save(ppTaller);
    }

    @Override
    public void deleteById(Integer id) {
        repo.deleteById(id);
    }
}
