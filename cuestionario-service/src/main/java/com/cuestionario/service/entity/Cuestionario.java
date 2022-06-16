package com.cuestionario.service.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "TAX_CUESTIONARIOS")
@Data
public class Cuestionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_cuestionario;

    private String no_cuestionario;
    private String fe_inicio;
    private String fe_fin;
    private Integer es_cuestionario;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "cuestionario")
    private Set<Pregunta> preguntas= new HashSet();
}
