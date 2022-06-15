package com.tipo.service.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "TAX_TIPOS")
@Data
public class Tipo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_tipo;

    private String no_tipo;
    private String co_alias;

}
