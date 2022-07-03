package com.maestra.citse.models;

import lombok.Data;

@Data
public class Tipo {
    private Integer idTipo;
    private String noTipo;
    private String coAlias;
    private Familia familia;
}
