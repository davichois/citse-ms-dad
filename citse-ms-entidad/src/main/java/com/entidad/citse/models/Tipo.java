package com.entidad.citse.models;

import lombok.Data;

import javax.persistence.Column;

@Data
public class Tipo {
    private Integer idTipo;
    private String noTipo;
    private String coAlias;
}
