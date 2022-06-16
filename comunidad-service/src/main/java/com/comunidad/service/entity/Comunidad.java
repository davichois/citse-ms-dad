package com.comunidad.service.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "TAX_COMUNIDADES")
@Data
public class Comunidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_comunidad;

    private String no_comunidad;

    private Integer nu_beneficiarios;

    @Column(name = "es_comunidad", columnDefinition = "BIT")
    private Boolean es_comunidad;

}
