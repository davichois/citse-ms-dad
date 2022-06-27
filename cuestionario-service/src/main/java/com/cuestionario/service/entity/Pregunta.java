package com.cuestionario.service.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "TAX_PREGUNTAS")
@Data
public class Pregunta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_preguntas")
    private Integer idPregunta;

    @Column(name = "desc_pregunta")
    private String descPregunta;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_cuestionario")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Cuestionario cuestionario;

}
