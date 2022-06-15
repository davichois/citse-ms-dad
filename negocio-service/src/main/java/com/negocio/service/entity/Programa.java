package com.negocio.service.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "TMA_PROGRAMAS")
@Data
public class Programa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_programa;

    private String no_programa;
    private String obj_programa;
    private String de_programa;
    private Character es_programa;

}
