package com.ubigeo.service.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "TAX_DISTRITOS")
@Data
public class Distrito {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_distrito")
    private Integer idDistrito;

    @Column(name = "no_distrito")
    private String noDistrito;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_provincia")
    private Integer id_provincia;
}
