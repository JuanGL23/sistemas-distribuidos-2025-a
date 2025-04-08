package com.corhuila.AgendaManager.Entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "actividad")
public class Actividad extends ABaseEntity{

    @Column(name = "code", nullable = false , length = 20)
    private String code;

    @Column(name = "name", nullable = false , length = 20, unique = true)
    private String name;

    @Column(name = "description", nullable = false , length = 50)
    private String description;

    @Column(name = "fecha", nullable = false)
    private LocalDateTime fecha;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "agenda_id", nullable = false, unique = true)
    private Agenda countryId;
}