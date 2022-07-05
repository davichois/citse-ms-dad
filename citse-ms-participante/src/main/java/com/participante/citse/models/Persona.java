package com.participante.citse.models;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class Persona implements Serializable {
    private Integer idPersona;
    private String noPersona;
    private String apPaterno;
    private String apMaterno;
    private String nuIndentificacion;
    private String feNacimiento;
    private Boolean esPersona;
    private Tipo tipoIdentificacion;
    private Tipo tipoPersona;
    private Tipo esCivil;
}
