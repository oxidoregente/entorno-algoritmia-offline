package com.brandon.nivel4.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

/**
 * SOLUCIÓN: Búsqueda por Atributos Embebidos.
 */
public interface EmpresaRepositorySolucion extends JpaRepository<EmpresaEnunciado, Long> {
    List<EmpresaEnunciado> findByDireccionCiudad(String ciudad);
}
