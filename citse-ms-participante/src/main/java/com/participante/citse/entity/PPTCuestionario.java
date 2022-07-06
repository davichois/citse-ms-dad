package com.participante.citse.entity;

import com.participante.citse.models.Cuestionario;
import com.participante.citse.models.Taller;
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

    @Transient
    private Cuestionario cuestionario;

    @Column(name = "ID_PP_TALLER")
    private Integer idPPTaller;

    @Transient
    private Taller taller;
}
