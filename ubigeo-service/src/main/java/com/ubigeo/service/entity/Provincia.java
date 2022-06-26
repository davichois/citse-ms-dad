package com.ubigeo.service.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="TMA_PROVINCIAS")
@Data
public class Provincia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_provincia")
    private Integer idProvincia;

    @Column(name = "no_provincia")
    private String noProvincia;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_departamento")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Integer id_departamento;

    @OneToMany(mappedBy = "id_provincia")
    private Set<Distrito> distritos = new HashSet<>();
}
