package com.ubigeo.service.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="TMA_DISTRITOS")
@Data
public class Distrito {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_distrito")
    private Integer idDistrito;

    @Column(name = "no_distrito")
    private String noDistrito;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_provincia")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Integer id_provincia;
}
