package com.participante.citse.service.ServiceImp;

import com.participante.citse.dao.PPTallerDao;
import com.participante.citse.entity.PPTaller;
import com.participante.citse.feignClients.TipoFeign;
import com.participante.citse.feignClients.negocioFeign;
import com.participante.citse.models.PersonaPrograma;
import com.participante.citse.models.Taller;
import com.participante.citse.models.Tipo;
import com.participante.citse.service.PPTallerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PPTallerServiceImp implements PPTallerService {

    @Autowired
    private PPTallerDao repo;

    @Autowired
    private negocioFeign negocioFeign;

    @Autowired
    private TipoFeign tipoFeign;
    @Override
    public List<PPTaller> findAll() {
        List<PPTaller> ppTallers =  repo.findAll();
        ppTallers.stream().forEach(ppTaller -> {
            PersonaPrograma pp = negocioFeign.getPersonaPrograma(ppTaller.getIdPersonaPrograma()).getBody();
            ppTaller.setPersonaPrograma(pp);

            Tipo tipo = tipoFeign.getTipo(ppTaller.getIdActividad()).getBody();
            ppTaller.setActividad(tipo);

        });
        return ppTallers;
    }

    @Override
    public PPTaller findById(Integer id) {
        PPTaller ppt = repo.findById(id).orElse(null);
        if(ppt!=null){
            PersonaPrograma pp = negocioFeign.getPersonaPrograma(ppt.getIdPersonaPrograma()).getBody();
            ppt.setPersonaPrograma(pp);
            Taller taller = negocioFeign.getTaller(ppt.getIdTaller()).getBody();
            ppt.setTaller(taller);
            Tipo tipo =tipoFeign.getTipo(ppt.getIdActividad()).getBody();
            ppt.setActividad(tipo);
        }
        return ppt;
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
