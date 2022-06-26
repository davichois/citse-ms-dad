package com.maestra.service.entity;

import lombok.Data;
import javax.persistence.*;

@Entity
@Table(name = "TMA_COMUNIDADES")
@Data
public class Comunidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_comunidad")
    private Integer idComunidad;

    @Column(name = "no_comunidad")
    private String noComunidad;

    @Column(name = "nu_beneficiarios")
    private Integer nuBeneficiarios;

    @Column(name = "es_comunidad")
    private Boolean esComunidad;

}
