package com.brandon.nivel4.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TareaRepositorySolucion extends JpaRepository<TareaSolucion, Long> {
    // Consulta por propiedad de objeto relacionado
    List<TareaSolucion> findByProyectoId(Long proyectoId);
}
