package com.participante.citse.models;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class Tipo implements Serializable {
    private Integer idTipo;
    private String noTipo;
    private String coAlias;
}
