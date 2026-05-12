package com.brandon.nivel4.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ItemRepositoryEnunciado extends JpaRepository<ItemEnunciado, Long> {
    // TODO: Encontrar items que tengan stock menor a un valor dado (Agotados)
}
