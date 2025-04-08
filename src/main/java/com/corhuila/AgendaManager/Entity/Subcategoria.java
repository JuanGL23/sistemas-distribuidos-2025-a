package com.corhuila.AgendaManager.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "subcategoria")
public class Subcategoria extends ABaseEntity{

    @Column(name = "code", nullable = false , length = 20)
    private String code;

    @Column(name = "name", nullable = false , length = 20, unique = true)
    private String name;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "categoria_id", nullable = false, unique = true)
    private Categoria categoriaId;
}