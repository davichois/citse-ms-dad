package com.persona.service.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "TMA_PERSONAS")
@Data
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_persona;

    private String no_persona;

    private String ap_paterno;

    private String ap_materno;

    private String nu_indentificacion;

    private String fe_nacimiento;

    @Column(name = "es_persona", columnDefinition = "BIT")
    private Boolean es_persona;

    private Integer id_ti_indentificacion;

    private Integer id_ti_persona;

    private Integer id_comunidad;

    private Integer id_ti_es_civil;

}
