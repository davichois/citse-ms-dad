package com.participante.citse.feignClients;

import com.participante.citse.models.PersonaPrograma;
import com.participante.citse.models.Taller;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "citse-ms-negocio")
public interface negocioFeign {
    @GetMapping("personaPrograma/{id}")
    public ResponseEntity<PersonaPrograma> getPersonaPrograma(@PathVariable Integer id);

    @GetMapping("taller/{id}")
    public ResponseEntity<Taller> getTaller(@PathVariable Integer id);

}
