package com.sg.citse.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tsg_usuarios")
@Data
public class Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Integer idUsuario;

    @Column(name = "nu_usuario", unique = true, length = 20)
    private String nuUsuario;

    @Column(name = "pw_usuario")
    private String pwUsuario;

    @Column(name = "es_usuario")
    private Boolean esUsuario;

}
