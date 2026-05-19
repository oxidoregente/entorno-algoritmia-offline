package com.algoritmia.nivel04.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

/**
 * SOLUCIÓN: Repositorio de Tareas.
 *
 * <p>Repository JPA para la entidad TareaSolucion con consultas derivadas.</p>
 */
public interface TareaRepositorySolucion extends JpaRepository<TareaSolucion, Long> {
    // Consulta por propiedad de objeto relacionado
    List<TareaSolucion> findByProyectoId(Long proyectoId);
}
