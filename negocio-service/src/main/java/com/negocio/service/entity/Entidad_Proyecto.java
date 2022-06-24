package com.negocio.service.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="TMV_ENTIDAD_PROYECTO")
@Data
public class Entidad_Proyecto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_entidad_proyecto;

    @Column(name="id_entidad")
    private Integer entidad;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_proyecto")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Proyecto proyectosa;

    @Column(name = "es_entidad_proyecto", columnDefinition = "BIT")
    private Boolean es_entidad_proyecto;

}
