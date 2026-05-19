package com.algoritmia.nivel04.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

/**
 * 🎓 RETO: Repositorio de Cartas de Tarot.
 * <b>Dificultad: Fácil</b>
 *
 * <p>Implementa un Query Method para buscar cartas por tipo de arcano, ordenadas por nombre ascendente.</p>
 * <p>Método sugerido: {@code findByArcanoOrderByNombreAsc(Arcano arcano)}</p>
 */
public interface CartaTarotRepositoryEnunciado extends JpaRepository<CartaTarotEnunciado, Long> {
    // TODO: Buscar por arcano ordenado por nombre ascendente
}
