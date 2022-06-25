package com.negocio.service.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="TMV_ENTIDAD_PROYECTO")
@Data
public class EntidadProyecto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_entidad_proyecto")
    private Integer idEntidadProyecto;

    @Column(name="id_entidad")
    private Integer entidad;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_proyecto")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Proyecto proyecto;

    @Column(name = "es_entidad_proyecto")
    private Boolean esEntidadProyecto;

}
