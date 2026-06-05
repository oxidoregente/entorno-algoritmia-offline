package com.algoritmia.nivel04.repositorios;

import jakarta.persistence.*;

/**
 * 🎓 RETO: Entidad Tarea (lado "muchos" de @ManyToOne).
 * <b>Dificultad: Media</b>
 *
 * <p>Modela una tarea de un gestor de proyectos (Jira, Trello, Asana...) que
 * pertenece a un único {@link ProyectoEnunciado}. Debes completar la
 * relación {@link jakarta.persistence.ManyToOne} y exponer un getter/setter
 * de {@code proyecto} para que el repositorio pueda hacer
 * {@code findByProyectoId(...)}.</p>
 *
 * <p><b>Estructura / Reglas:</b></p>
 * <ul>
 *   <li>{@code id}: clave primaria autogenerada ({@link GenerationType#IDENTITY}).</li>
 *   <li>{@code descripcion}: descripción libre de la tarea.</li>
 *   <li>Falta el atributo {@code proyecto} con {@code @ManyToOne} (lado propietario de la FK).</li>
 *   <li>Se recomienda añadir también {@code @JoinColumn(name = "proyecto_id")} para nombrar la FK.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * ProyectoEnunciado p = new ProyectoEnunciado("Ecommerce");
 * TareaEnunciado    t = new TareaEnunciado("Crear API");
 * // t.setProyecto(p);  // tras añadir el setter
 *
 * // Tabla resultante (aprox.):
 * // | id | descripcion | proyecto_id |
 * // |  1 | Crear API   |           1 |
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>El lado {@code @ManyToOne} es el "propietario" de la relación (contiene la FK).</li>
 *   <li>Para que {@code findByProyectoId} funcione, el campo debe llamarse {@code proyecto}.</li>
 * </ul>
 */
@Entity
public class TareaEnunciado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descripcion;

    // TODO: Añadir relación @ManyToOne con ProyectoEnunciado
    @ManyToOne
    private ProyectoEnunciado proyecto;

    public TareaEnunciado() {}
    public TareaEnunciado(String descripcion) { this.descripcion = descripcion; }
    public Long getId() { return id; }
    public String getDescripcion() { return descripcion; }
    public ProyectoEnunciado getProyecto() { return proyecto; }
    public void setProyecto(ProyectoEnunciado proyecto) { this.proyecto = proyecto; }
}
