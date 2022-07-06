package com.participante.citse.feignClients;

import com.participante.citse.models.Cuestionario;
import com.participante.citse.models.Pregunta;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "citse-ms-cuestionario")
public interface CuestionarioFeignClient {

    @GetMapping("cuestionario/{id}")
    public ResponseEntity<Cuestionario> getCuestionario(@PathVariable Integer id);

    @GetMapping("pregunta/{id}")
    public ResponseEntity<Pregunta> getPregunta(@PathVariable Integer id);
}
