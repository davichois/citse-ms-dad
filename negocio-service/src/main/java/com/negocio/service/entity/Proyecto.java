package com.negocio.service.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "TMA_PROYECTOS")
@Data
public class Proyecto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_proyecto")
    private Integer idProyecto;

    @Column(name = "no_proyecto")
    private String noProyecto;

    @Column(name = "obj_proyecto")
    private String objProyecto;

    @Column(name = "de_proyecto")
    private String deProyecto;

    @Column(name = "fe_inicio")
    private String feInicio;

    @Column(name = "fe_fin")
    private String feFin;

    @Column(name = "es_proyecto", columnDefinition = "BIT")
    private Boolean esProyecto;

    @OneToMany(mappedBy = "proyecto", cascade = CascadeType.ALL)
    private List<Programa> programas;

    @OneToMany(mappedBy = "proyecto", cascade = CascadeType.ALL)
    private List<EntidadProyecto> entidades;

    @OneToMany(mappedBy = "proyecto", cascade = CascadeType.ALL)
    private List<ProyectoLugar> lugares;

}
