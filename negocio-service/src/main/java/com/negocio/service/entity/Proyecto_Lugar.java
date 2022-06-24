package com.negocio.service.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "TMV_PROYECTO_LUGAR")
@Data
public class Proyecto_Lugar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_proyecto_lugar;

    @Column(name = "id_distrito")
    private Integer id_distrito;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_proyecto")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Proyecto proyectosb;

    @Column(name = "es_proyecto_lugar", columnDefinition = "BIT")
    private Boolean es_proyecto_lugar;
}
