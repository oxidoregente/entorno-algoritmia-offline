package com.algoritmia.nivel04.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 🎓 RETO: Repositorio de Coches (Conteo).
 * <b>Dificultad: Fácil</b>
 *
 * <p>Implementa un Query Method para contar cuántos coches hay de una marca específica.</p>
 * <p>Método sugerido: {@code long countByMarca(String marca)}</p>
 */
public interface CocheRepositoryEnunciado extends JpaRepository<CocheEnunciado, Long> {
    // TODO: Contar coches por marca
    long countByMarca(String marca);
}
