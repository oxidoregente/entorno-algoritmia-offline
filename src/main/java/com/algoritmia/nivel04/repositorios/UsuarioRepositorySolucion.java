package com.algoritmia.nivel04.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDateTime;
import java.util.List;

/**
 * SOLUCIÓN: Repositorio de Usuarios.
 *
 * <p>Repository JPA para la entidad UsuarioSolucion con consultas derivadas.</p>
 */
public interface UsuarioRepositorySolucion extends JpaRepository<UsuarioSolucion, Long> {
    List<UsuarioSolucion> findByActivoTrueAndFechaRegistroAfter(LocalDateTime fecha);
}
