package com.algoritmia.nivel04.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

/**
 * 🎓 RETO: Repositorio de Transacciones.
 * <b>Dificultad: Fácil</b>
 *
 * <p>Implementa un Query Method para buscar transacciones por estado.</p>
 * <p>Método sugerido: {@code findByEstado(String estado)}</p>
 */
@Repository
public interface TransaccionRepositoryEnunciado extends JpaRepository<TransaccionEnunciado, Long> {
    // TODO: Implementa un Query Method para buscar por estado
    List<TransaccionEnunciado> findByEstado(String estado);
}
