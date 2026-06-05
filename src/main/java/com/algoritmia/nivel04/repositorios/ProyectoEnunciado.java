package com.algoritmia.nivel04.repositorios;

import jakarta.persistence.*;

/**
 * 🎓 RETO: Entidad Proyecto (lado "uno" de la relación).
 * <b>Dificultad: Media</b>
 *
 * <p>Modela un proyecto que agrupa múltiples tareas en un gestor tipo Jira,
 * Trello o Asana. Es la parte "uno" de la relación bidireccional
 * {@code Proyecto 1 — N Tarea}, y sirve para practicar relaciones
 * {@link jakarta.persistence.OneToMany}/{@link jakarta.persistence.ManyToOne}.</p>
 *
 * <p><b>Estructura / Reglas:</b></p>
 * <ul>
 *   <li>{@code id}: clave primaria autogenerada ({@link GenerationType#IDENTITY}).</li>
 *   <li>{@code nombre}: título del proyecto (p. ej. "Migración a Spring Boot").</li>
 *   <li>La relación con {@link TareaEnunciado} se modela desde el lado de la tarea ({@code @ManyToOne}).</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * ProyectoEnunciado p = new ProyectoEnunciado("Ecommerce");
 * proyectoRepo.save(p);
 *
 * TareaEnunciado t = new TareaEnunciado("Crear API");
 * // t.setProyecto(p);  // tras añadir la relación
 * tareaRepo.save(t);
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>No hace falta una colección de tareas aquí: la relación se modela desde {@link TareaEnunciado}.</li>
 *   <li>El constructor sin argumentos es obligatorio para JPA.</li>
 * </ul>
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
