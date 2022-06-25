package com.negocio.service.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "TMV_PERSONAS_PROGRAMA")
@Data
public class PersonaPrograma {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PERSONA_PROGRAMA")
    private Integer idPersonaPrograma;

    @Column(name = "ID_PERSONA")
    private Integer idPersona;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_PROYECTO")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Proyecto proyecto;

}
