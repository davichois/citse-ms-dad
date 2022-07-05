package com.participante.citse.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "TMV_RESPUESTAS")
public class Respuestas implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_RESPUESTAS")
    private Integer id;

    @Column(name = "id_pregunta")
    private Integer idPregunta;

    @Column(name = "id_pp_taller")
    private Integer idPPTaller;

    @Column(name = "desc_respuesta")
    private String respuesta;
}
