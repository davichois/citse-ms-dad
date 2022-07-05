package com.participante.citse.models;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class PersonaPrograma implements Serializable {
    private Integer id;
    private Integer idPersona;
    private Persona persona;
    private Programa programa;
}
