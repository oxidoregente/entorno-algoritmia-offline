package com.algoritmia.nivel04.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

/**
 * 🏆 SOLUCIÓN: Repositorio de Clientes.
 */
public interface ClienteRepositorySolucion extends JpaRepository<ClienteEnunciado, Long> {
    List<ClienteEnunciado> findByNombre(String nombre);
}
