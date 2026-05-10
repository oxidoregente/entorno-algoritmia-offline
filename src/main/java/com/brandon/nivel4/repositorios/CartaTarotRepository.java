package com.brandon.nivel4.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

/**
 * Repositorio para la entidad CartaTarot.
 */
public interface CartaTarotRepository extends JpaRepository<CartaTarot, Long> {
    
    /**
     * Busca cartas por su tipo de arcano y las ordena alfabéticamente.
     * 
     * @param arcano Tipo de arcano (MAYOR/MENOR).
     * @return Lista de cartas filtradas y ordenadas.
     */
    List<CartaTarot> findByArcanoOrderByNombreAsc(CartaTarot.Arcano arcano);
}
