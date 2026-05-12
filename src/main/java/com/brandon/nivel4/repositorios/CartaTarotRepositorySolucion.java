package com.brandon.nivel4.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CartaTarotRepositorySolucion extends JpaRepository<CartaTarotSolucion, Long> {
    List<CartaTarotSolucion> findByArcanoOrderByNombreAsc(CartaTarotSolucion.Arcano arcano);
}
