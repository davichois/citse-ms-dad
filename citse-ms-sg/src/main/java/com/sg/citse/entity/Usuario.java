package com.sg.citse.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

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

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "tsg_usuario_rol",
            joinColumns = @JoinColumn(name = "id_usuario"),
            inverseJoinColumns = @JoinColumn(name = "id_rol"),
            uniqueConstraints = {@UniqueConstraint(columnNames = {"id_usuario", "id_rol"})})
    private List<Role> roles;

}
