package com.participante.citse.feignClients;

import com.participante.citse.models.PersonaPrograma;
import com.participante.citse.models.Tipo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "citse-ms-tipo")
public interface TipoFeign {
    @GetMapping("tipo/{id}")
    public ResponseEntity<Tipo> getTipo(@PathVariable Integer id);
}
