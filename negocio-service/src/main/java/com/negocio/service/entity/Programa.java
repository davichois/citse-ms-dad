package com.negocio.service.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "TMA_PROGRAMAS")
@Data
public class Programa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_programa;

    private String no_programa;

    private String obj_programa;

    private String de_programa;

    private String fe_inicio;

    private String fe_fin;

    @Column(name = "es_programa", columnDefinition = "BIT")
    private Boolean es_programa;

    @OneToMany(mappedBy = "programa", cascade = CascadeType.ALL)
    private Set<Taller> talleres = new HashSet<>();

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_proyecto")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Proyecto proyecto;


    public void setTalleres(Set<Taller> talleres) {
        this.talleres = talleres;
        for (Taller taller : talleres){
            taller.setPrograma(this);
        }
    }
}
