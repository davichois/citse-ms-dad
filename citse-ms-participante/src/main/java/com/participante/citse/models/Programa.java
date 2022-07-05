package com.participante.citse.models;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class Programa implements Serializable {
    private Integer id;
    private String nombre;
    private String objetivo;
    private String descripcion;
    private String inicio;
    private String fin;
    private Boolean estado;
    private Proyecto proyecto;
}
