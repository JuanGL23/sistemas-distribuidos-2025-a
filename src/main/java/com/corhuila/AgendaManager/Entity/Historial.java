package com.corhuila.AgendaManager.Entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "historial")
public class Historial extends ABaseEntity{

    @Column(name = "code", nullable = false , length = 20)
    private String code;

    @Column(name = "description", nullable = false , length = 50)
    private String description;

    @Column(name = "fecha", nullable = false)
    private LocalDateTime fecha;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "formulario_id", nullable = false, unique = true)
    private Formulario formularioId;
}