package com.negocio.service.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "TMA_TALLERES")
@Data
public class Taller {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_taller")
    private Integer idTaller;

    @Column(name = "no_taller")
    private String noTaller;

    @Column(name = "obj_taller")
    private String objTaller;

    @Column(name = "de_taller")
    private String deTaller;

    @Column(name = "fe_inicio")
    private String feInicio;

    @Column(name = "fe_fin")
    private String feFin;

    @Column(name = "es_taller")
    private Boolean esTaller;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_programa")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Programa programa;

}
