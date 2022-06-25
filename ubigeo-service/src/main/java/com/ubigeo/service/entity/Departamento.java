package com.ubigeo.service.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="TAX_DEPARTAMENTOS")
@Data
public class Departamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_departamento")
    private Integer idDepartamento;

    @Column(name = "no_departamento")
    private String noDepartamento;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id_departamento")
    private List<Provincia> provincias;
}
