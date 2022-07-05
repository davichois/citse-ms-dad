package com.participante.citse.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Table(name = "TMV_PPT_CUESTIONARIO")
@Entity
public class PPTCuestionario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PPT_CUESTIONARIO")
    private Integer id;

    @Column(name = "ID_CUESTIONARIO")
    private Integer idCuestionario;

    @Column(name = "ID_PP_TALLER")
    private Integer idPPTaller;
}
