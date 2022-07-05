package com.participante.citse.feignClients;

import com.participante.citse.models.PersonaPrograma;
import com.participante.citse.models.Taller;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class negocioFallback implements negocioFeign {
    @Override
    public ResponseEntity<PersonaPrograma> getPersonaPrograma(Integer id) {
        PersonaPrograma pp = PersonaPrograma.builder().id(0).idPersona(0).build();
        return ResponseEntity.ok(pp);
    }

    @Override
    public ResponseEntity<Taller> getTaller(Integer id) {
        return null;
    }
}
