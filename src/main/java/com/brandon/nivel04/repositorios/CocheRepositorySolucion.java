package com.brandon.nivel04.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 🏆 SOLUCIÓN: Repositorio de Coches.
 */
public interface CocheRepositorySolucion extends JpaRepository<CocheEnunciado, Long> {
    long countByMarca(String marca);
}
