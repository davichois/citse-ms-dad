package com.negocio.service.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "TMA_PROGRAMAS")
@Data
public class Programa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_programa")
    private Integer idPrograma;

    @Column(name = "no_programa")
    private String noPrograma;

    @Column(name = "obj_programa")
    private String objPrograma;

    @Column(name = "de_programa")
    private String dePrograma;

    @Column(name = "fe_inicio")
    private String feInicio;

    @Column(name = "fe_fin")
    private String feFin;

    @Column(name = "es_programa")
    private Boolean esPrograma;

    @OneToMany(mappedBy = "programa", cascade = CascadeType.ALL)
    private List<Taller> talleres;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_proyecto")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Proyecto proyecto;

}
