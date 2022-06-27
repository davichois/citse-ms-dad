package com.negocio.service.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "TMV_PROYECTO_LUGAR")
@Data
public class ProyectoLugar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_proyecto_lugar")
    private Integer idProyectoLugar;

    @Column(name = "id_distrito")
    private Integer idDistrito;

    @Column(name = "es_proyecto_lugar", columnDefinition = "BIT")
    private Boolean esProyectoLugar;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_proyecto")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Proyecto proyecto;

}
