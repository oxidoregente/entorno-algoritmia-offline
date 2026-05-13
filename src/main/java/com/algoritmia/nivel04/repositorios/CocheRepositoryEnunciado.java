package com.algoritmia.nivel04.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CocheRepositoryEnunciado extends JpaRepository<CocheEnunciado, Long> {
    // TODO: Contar coches por marca
    // long countByMarca(String marca);
}
