package com.participante.citse.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Data
@Builder
public class Pregunta implements Serializable {
    private Integer idPregunta;
    private String descPregunta;
    private Cuestionario cuestionario;
}
