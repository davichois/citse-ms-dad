package com.tipo.service.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "TAX_FAMILIAS")
@Data
public class Familia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_familia")
    private Integer idFamilia;

    @Column(name = "no_familia")
    private String noFamilia;

    @OneToMany(mappedBy = "familia", cascade = CascadeType.ALL)
    private Set<Tipo> tipos = new HashSet<>();


    public void setTipos(Set<Tipo> tipos) {
        this.tipos = tipos;
        for (Tipo tipo: tipos){
            tipo.setFamilia(this);
        }
    }
}
