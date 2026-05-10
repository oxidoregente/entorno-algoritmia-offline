package com.brandon.nivel4.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

/**
 * Spring Data JPA genera la implementación de este repositorio automáticamente.
 */
@Repository
public interface TransaccionRepository extends JpaRepository<Transaccion, Long> {
    
    // Query personalizada usando convención de nombres (Query Methods)
    List<Transaccion> findByEstado(String estado);
}
