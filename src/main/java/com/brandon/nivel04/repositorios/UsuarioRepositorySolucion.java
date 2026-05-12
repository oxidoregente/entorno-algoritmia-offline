package com.brandon.nivel04.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDateTime;
import java.util.List;

public interface UsuarioRepositorySolucion extends JpaRepository<UsuarioSolucion, Long> {
    List<UsuarioSolucion> findByActivoTrueAndFechaRegistroAfter(LocalDateTime fecha);
}
