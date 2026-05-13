package com.algoritmia.nivel04.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

/**
 * SOLUCIÓN: Ranking de Jugadores.
 */
public interface JugadorRepositorySolucion extends JpaRepository<JugadorEnunciado, Long> {
    // Spring Data permite usar TopN en el nombre del método
    List<JugadorEnunciado> findTop3ByOrderByPuntajeDesc();
}
