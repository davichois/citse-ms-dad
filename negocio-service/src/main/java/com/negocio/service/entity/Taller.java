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
    private Integer id_taller;

    private String no_taller;

    private String obj_taller;

    private String de_taller;

    private String fe_inicio;

    private String fe_fin;

    @Column(name = "es_taller", columnDefinition = "BIT")
    private Boolean es_taller;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_programa")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Programa programa;

}
