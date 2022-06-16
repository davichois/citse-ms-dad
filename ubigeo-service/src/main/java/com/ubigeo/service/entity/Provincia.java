package com.ubigeo.service.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="TAX_PROVINCIAS")
@Data
public class Provincia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_provincia;

    private String no_provincia;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_departamento")
    private Integer id_departamento;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id_provincia")
    private List<Distrito> distritos;
}
