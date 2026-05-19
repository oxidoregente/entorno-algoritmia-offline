package com.algoritmia.nivel04.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

/**
 * 🎓 RETO: Repositorio de Empresas (@Embedded).
 * <b>Dificultad: Media</b>
 *
 * <p>Implementa un Query Method para buscar empresas por la ciudad de su dirección embebida.</p>
 * <p>Método sugerido: {@code findByDireccionCiudad(String ciudad)}</p>
 */
public interface EmpresaRepositoryEnunciado extends JpaRepository<EmpresaEnunciado, Long> {
    // TODO: Encontrar empresas por ciudad del objeto embebido
}
