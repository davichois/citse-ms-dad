package com.participante.citse.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.participante.citse.models.PersonaPrograma;
import com.participante.citse.models.Taller;
import com.participante.citse.models.Tipo;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Table(name = "TMV_PP_TALLER")
@Entity
public class PPTaller implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PP_TALLER")
    private Integer id;

    @Column(name = "ID_PERSONA_PROGRAMA")
    private Integer idPersonaPrograma;

    @Transient
    private PersonaPrograma personaPrograma;

    @Column(name = "ID_TALLER")
    private Integer idTaller;

    @Transient
    private Taller taller;

    @Column(name = "ID_ACTIVIDAD")
    private Integer idActividad;

    @Transient
    private Tipo actividad;

    @JsonIgnore
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "ppTaller")
    private List<Respuesta> respuestas;
}
