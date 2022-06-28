package com.tipo.service.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "TAX_TIPOS")
@Data
public class Tipo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo")
    private Integer idTipo;

    @Column(name = "no_tipo")
    private String noTipo;

    @Column(name = "co_alias")
    private String coAlias;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_familia")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Familia familia;

}
