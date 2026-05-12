package com.brandon.nivel4.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TransaccionRepositorySolucion extends JpaRepository<TransaccionSolucion, Long> {
    List<TransaccionSolucion> findByEstado(String estado);
}
