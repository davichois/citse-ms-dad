package com.tipo.service.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

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
    private List<Tipo> tipos;

}
