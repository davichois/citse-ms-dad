package com.negocio.service.entity;

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
    private String fe_final;
    private Character es_taller;

}
