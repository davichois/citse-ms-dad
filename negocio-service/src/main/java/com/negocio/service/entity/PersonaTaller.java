package com.negocio.service.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "TMV_PERSONAS_TALLER")
@Data
public class PersonaTaller {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PERSONA_TALLER")
    private Integer idPersonaTaller;

    @Column(name = "ID_PERSONA")
    private Integer idPersona;

    @Column(name = "ES_ASISTENCIA")
    private Boolean esAsistencia;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_TALLER")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Taller taller;

}
