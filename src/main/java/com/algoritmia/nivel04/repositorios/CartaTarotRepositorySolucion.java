package com.algoritmia.nivel04.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

/**
 * SOLUCIÓN: Repositorio de Cartas Tarot.
 *
 * <p>Repository JPA para la entidad CartaTarotSolucion con consultas derivadas.</p>
 */
public interface CartaTarotRepositorySolucion extends JpaRepository<CartaTarotSolucion, Long> {
    List<CartaTarotSolucion> findByArcanoOrderByNombreAsc(CartaTarotSolucion.Arcano arcano);
}
