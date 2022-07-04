package com.sg.citse.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tsg_roles")
@Data
public class Role implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_rol")
    private Integer idRol;

    @Column(name = "no_rol", unique = true)
    private String noRol;

    @Column(name = "es_rol")
    private Boolean esRol;

}
