package com.brandon.nivel04.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface EmpresaRepositoryEnunciado extends JpaRepository<EmpresaEnunciado, Long> {
    // TODO: Encontrar empresas por el nombre de la ciudad del objeto embebido
    // Pista: findByDireccionCiudad
}
