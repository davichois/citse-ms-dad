package com.participante.citse.service.ServiceImp;

import com.participante.citse.dao.PPTCuesionarioDao;
import com.participante.citse.entity.PPTCuestionario;
import com.participante.citse.feignClients.CuestionarioFeignClient;
import com.participante.citse.feignClients.negocioFeign;
import com.participante.citse.models.Cuestionario;
import com.participante.citse.models.Taller;
import com.participante.citse.service.PPTCuestionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PPTCuestionarioServiceImp implements PPTCuestionarioService {

    @Autowired
    private PPTCuesionarioDao repo;

    @Autowired
    private negocioFeign negocioFeign;

    @Autowired
    private CuestionarioFeignClient cuestionarioFeignClient;
    @Override
    public List<PPTCuestionario> findAll() {
        return repo.findAll();
    }

    @Override
    public PPTCuestionario findById(Integer id) {
        PPTCuestionario pptc = repo.findById(id).orElse(null);
        if(pptc!=null){
            Taller taller = negocioFeign.getTaller(pptc.getIdPPTaller()).getBody();
            pptc.setTaller(taller);
            Cuestionario cuestionario = cuestionarioFeignClient.getCuestionario(pptc.getIdCuestionario()).getBody();
            pptc.setCuestionario(cuestionario);
        }
        return pptc;
    }

    @Override
    public PPTCuestionario save(PPTCuestionario pptCuestionario) {
        return repo.save(pptCuestionario);
    }

    @Override
    public void deleteById(Integer id) {
        repo.deleteById(id);
    }
}
