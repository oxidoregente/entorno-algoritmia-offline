package com.algoritmia.nivel04.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

/**
 * 🎓 RETO: Repositorio de Tareas (navegación por relación).
 * <b>Dificultad: Fácil</b>
 *
 * <p>Repositorio JPA para listar todas las tareas de un proyecto concreto.
 * Operación clásica en gestores de proyectos: "dame las tareas del proyecto
 * X" para pintar el tablero o el backlog del sprint.</p>
 *
 * <p><b>Estructura / Reglas:</b></p>
 * <ul>
 *   <li>Extiende {@link JpaRepository} sobre {@link TareaEnunciado} con clave {@link Long}.</li>
 *   <li>Debes añadir un Query Method que navegue por la asociación: {@code findByProyectoId(...)}.</li>
 *   <li>Spring Data sigue la relación {@code @ManyToOne proyecto} hasta su {@code id}.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * List&lt;TareaEnunciado&gt; tareas = repository.findByProyectoId(42L);
 * // -&gt; todas las tareas asociadas al proyecto con id 42
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>El nombre del método sigue el patrón {@code findBy<Relacion><PropiedadDestino>}.</li>
 *   <li>Spring Data hace internamente un {@code JOIN} con la tabla de proyectos.</li>
 *   <li>Para evitar ambigüedades, también vale {@code findByProyecto_Id}.</li>
 * </ul>
 */
public interface TareaRepositoryEnunciado extends JpaRepository<TareaEnunciado, Long> {
    // TODO: Encontrar tareas por ID del proyecto
    List<TareaEnunciado> findByProyectoId(long proyectoId);
}
