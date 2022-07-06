package com.participante.citse.models;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;

@Data
@Builder
public class Cuestionario {
    private Integer idCuestionario;
    private String noCuestionario;
    private String feInicio;
    private String feFin;
    private Boolean esCuestionario;
}
