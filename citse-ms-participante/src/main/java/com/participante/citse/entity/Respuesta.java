package com.participante.citse.entity;

import com.participante.citse.models.Pregunta;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "TMV_RESPUESTAS")
public class Respuesta implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_RESPUESTAS")
    private Integer id;

    @Column(name = "id_pregunta")
    private Integer idPregunta;

    @Transient
    private Pregunta pregunta;

    @ManyToOne
    @JoinColumn(name = "ID_PP_TALLER")
    private PPTaller ppTaller;

    @Column(name = "desc_respuesta")
    private String respuesta;
}
