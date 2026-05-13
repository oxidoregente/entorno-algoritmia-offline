package com.algoritmia.nivel04.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDateTime;
import java.util.List;

public interface UsuarioRepositoryEnunciado extends JpaRepository<UsuarioEnunciado, Long> {
    // TODO: Busca usuarios que estén activos Y se hayan registrado DESPUÉS de una fecha
    // findByActivoTrueAndFechaRegistroAfter
}
