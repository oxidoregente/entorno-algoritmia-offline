package com.algoritmia.nivel04.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

/**
 * 🎓 RETO: Repositorio de Clientes.
 * <b>Dificultad: Fácil</b>
 *
 * <p>Implementa un Query Method para buscar clientes por su nombre exacto.</p>
 * <p>Método sugerido: {@code findByNombre(String nombre)}</p>
 */
public interface ClienteRepositoryEnunciado extends JpaRepository<ClienteEnunciado, Long> {
    // TODO: Buscar clientes por nombre exacto
}
