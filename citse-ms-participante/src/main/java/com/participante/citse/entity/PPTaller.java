package com.participante.citse.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

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

    @Column(name = "ID_TALLER")
    private Integer idTaller;

    @Column(name = "ID_ACTIVIDAD")
    private Integer idActividad;
}
