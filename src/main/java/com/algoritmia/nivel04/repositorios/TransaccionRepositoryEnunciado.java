package com.algoritmia.nivel04.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface TransaccionRepositoryEnunciado extends JpaRepository<TransaccionEnunciado, Long> {
    // TODO: Implementa un Query Method para buscar por 'estado'
}
