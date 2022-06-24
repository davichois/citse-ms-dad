package com.negocio.service.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "TMA_PROYECTOS")
@Data
public class Proyecto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_proyecto;

    private String no_proyecto;

    private String obj_proyecto;

    private String de_proyecto;

    private String fe_inicio;

    private String fe_fin;

    @Column(name = "es_proyecto", columnDefinition = "BIT")
    private Boolean es_proyecto;

    @OneToMany(mappedBy = "proyecto", cascade = CascadeType.ALL)
    private Set<Programa> programas = new HashSet<>();

    @OneToMany(mappedBy = "proyectosa",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Entidad_Proyecto> entidades;

    @OneToMany(mappedBy = "proyectosb",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private Set<Proyecto_Lugar> lugares;

    public void setProgramas(Set<Programa> programas) {
        this.programas = programas;
        for (Programa programa: programas){
            programa.setProyecto(this);
        }
    }
}
