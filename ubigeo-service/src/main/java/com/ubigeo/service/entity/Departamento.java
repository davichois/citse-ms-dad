package com.ubigeo.service.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="TMA_DEPARTAMENTOS")
@Data
public class Departamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_departamento")
    private Integer idDepartamento;

    @Column(name = "no_departamento")
    private String noDepartamento;

    @OneToMany(mappedBy = "id_departamento")
    private Set<Provincia> provincias = new HashSet<>();
}
