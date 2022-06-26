package com.maestra.service.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "TMA_PERSONAS")
@Data
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_persona")
    private Integer idPersona;

    @Column(name = "no_persona")
    private String noPersona;

    @Column(name = "ap_paterno")
    private String apPaterno;

    @Column(name = "ap_materno")
    private String apMaterno;

    @Column(name = "nu_identificacion")
    private String nuIndentificacion;

    @Column(name = "fe_nacimiento")
    private String feNacimiento;

    @Column(name = "es_persona", columnDefinition = "BIT")
    private Boolean esPersona;

    @Column(name = "id_ti_identificacion")
    private Integer idTiIndentificacion;

    @Column(name = "id_ti_persona")
    private Integer idTiPersona;

    @Column(name = "id_comunidad")
    private Integer idComunidad;

    @Column(name = "id_ti_es_civil")
    private Integer idTiEsCivil;

}
