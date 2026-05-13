package com.algoritmia.nivel04.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ClienteRepositoryEnunciado extends JpaRepository<ClienteEnunciado, Long> {
    // TODO: Buscar clientes por nombre exacto
    // List<ClienteEnunciado> findByNombre(String nombre);
}
