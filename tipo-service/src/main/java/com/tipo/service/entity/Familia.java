package com.tipo.service.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "TAX_FAMILIAS")
@Data
public class Familia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_familia;

    private String no_familia;

}
