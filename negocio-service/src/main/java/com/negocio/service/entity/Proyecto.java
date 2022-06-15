package com.negocio.service.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "TMA_PROYECTOS")
@Data
public class Proyecto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_proyecto;

    private String no_proyecto;
    private String obj_proyecto;
    private String de_proyecto;
    private String fe_inicio;
    private char es_proyecto;

}
