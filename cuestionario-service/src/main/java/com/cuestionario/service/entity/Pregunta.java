package com.cuestionario.service.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="TAX_PREGUNTAS")
@Data
public class Pregunta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_pregunta;

    private String desc_pregunta;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_cuestionario")
    private Integer cuestionario;
}
