package com.algoritmia.nivel04.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

/**
 * SOLUCIÓN: Repositorio de Transacciones.
 *
 * <p>Repository JPA para la entidad TransaccionSolucion con consultas derivadas.</p>
 */
public interface TransaccionRepositorySolucion extends JpaRepository<TransaccionSolucion, Long> {
    List<TransaccionSolucion> findByEstado(String estado);
}
