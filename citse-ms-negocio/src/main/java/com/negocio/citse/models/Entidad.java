package com.negocio.citse.models;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
public class Entidad implements Serializable {
    private Integer id;
    private String nombre;
    private String alias;
    private String feInstancia;
    private Entidad idPadre;
    private Integer idTipoEntidad;
}
