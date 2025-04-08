package com.corhuila.AgendaManager.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "revision")
public class Revision extends ABaseEntity{

    @Column(name = "code", nullable = false , length = 20)
    private String code;

    @Column(name = "observaciones", nullable = false , length = 20, unique = true)
    private String observaciones;

    @Column(name = "estado", nullable = false , length = 20, unique = true)
    private String estado;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "usuario_id", nullable = false, unique = true)
    private Usuario usuarioId;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "formulario_id", nullable = false, unique = true)
    private Formulario formularioId;
}
