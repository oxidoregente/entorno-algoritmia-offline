package com.algoritmia.nivel04.repositorios;

import jakarta.persistence.*;

/**
 * 🎓 RETO: Entidad Proyecto (Relación One-to-Many).
 * <b>Dificultad: Media</b>
 *
 * <p>Modela un proyecto que puede tener múltiples tareas asociadas.
 * Se usa junto a TareaEnunciado para practicar relaciones @OneToMany / @ManyToOne.</p>
 */
@Entity
public class ProyectoEnunciado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;

    public ProyectoEnunciado() {}
    public ProyectoEnunciado(String nombre) { this.nombre = nombre; }
    public Long getId() { return id; }
    public String getNombre() { return nombre; }
}
