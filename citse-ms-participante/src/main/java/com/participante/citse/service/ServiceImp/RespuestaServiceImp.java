package com.participante.citse.service.ServiceImp;

import com.participante.citse.dao.RespuestaDao;
import com.participante.citse.entity.Respuesta;
import com.participante.citse.feignClients.CuestionarioFeignClient;
import com.participante.citse.models.Pregunta;
import com.participante.citse.service.RespuestaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RespuestaServiceImp implements RespuestaService {

    @Autowired
    private RespuestaDao repo;

    @Autowired
    private CuestionarioFeignClient cuestionarioFeignClient;

    @Override
    public List<Respuesta> findAll() {
        return repo.findAll();
    }

    @Override
    public Respuesta findById(Integer id) {
        Respuesta response= repo.findById(id).orElse(null);
        if(response!=null){
            Pregunta pregunta = cuestionarioFeignClient.getPregunta(response.getIdPregunta()).getBody();
            response.setPregunta(pregunta);
        }
        return response;
    }

    @Override
    public Respuesta save(Respuesta respuesta) {
        return repo.save(respuesta);
    }

    @Override
    public void delete(Integer id) {
        repo.deleteById(id);
    }
}
