package com.maestra.service.entity;

import lombok.Data;
import javax.persistence.*;

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
