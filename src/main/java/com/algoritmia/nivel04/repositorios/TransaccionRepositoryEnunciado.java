package com.algoritmia.nivel04.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

/**
 * 🎓 RETO: Repositorio de Transacciones.
 * <b>Dificultad: Fácil</b>
 *
 * <p>Repositorio JPA para listar las transacciones financieras por su
 * estado actual. Es la base de paneles tipo "transacciones pendientes",
 * "fallidas hoy" o "completadas del día" en backoffice bancario o de
 * ecommerce.</p>
 *
 * <p><b>Estructura / Reglas:</b></p>
 * <ul>
 *   <li>Anotado con {@link Repository} (opcional sobre interfaces, pero explícito aquí).</li>
 *   <li>Extiende {@link JpaRepository} sobre {@link TransaccionEnunciado} con clave {@link Long}.</li>
 *   <li>Debes añadir un Query Method que filtre por el campo {@code estado}.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * List&lt;TransaccionEnunciado&gt; pendientes = repository.findByEstado("PENDIENTE");
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>El patrón {@code findBy<Campo>} hace una búsqueda por igualdad estricta.</li>
 *   <li>Si el estado fuera un enum, usarías {@code findByEstado(EstadoEnum estado)}.</li>
 * </ul>
 */
@Repository
public interface TransaccionRepositoryEnunciado extends JpaRepository<TransaccionEnunciado, Long> {
    // TODO: Implementa un Query Method para buscar por estado
}
