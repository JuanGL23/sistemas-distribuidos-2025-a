package com.corhuila.AgendaManager.Entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "agenda")
public class Agenda extends ABaseEntity{

    @Column(name = "code", nullable = false , length = 20)
    private String code;

    @Column(name = "name", nullable = false , length = 20, unique = true)
    private String name;

    @Column(name = "fecha_inicio", nullable = false)
    private LocalDateTime fecha_inicio;

    @Column(name = "fecha_final", nullable = false)
    private LocalDateTime fecha_final;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "usuario_id", nullable = false, unique = true)
    private Usuario usuarioId;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(LocalDateTime fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public LocalDateTime getFecha_final() {
        return fecha_final;
    }

    public void setFecha_final(LocalDateTime fecha_final) {
        this.fecha_final = fecha_final;
    }

    public Usuario getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Usuario usuarioId) {
        this.usuarioId = usuarioId;
    }
}