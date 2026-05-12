package com.brandon.nivel4.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CartaTarotRepositoryEnunciado extends JpaRepository<CartaTarotEnunciado, Long> {
    // TODO: Buscar por arcano y ordenar por nombre ascendente
}
