package com.ubigeo.service.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "TAX_DISTRITOS")
@Data
public class Distrito {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_distrito;

    private String no_distrito;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_provincia")
    private Integer id_provincia;
}
