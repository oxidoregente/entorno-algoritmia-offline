package com.algoritmia.nivel04.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 🎓 RETO: Repositorio de Coches (Conteo).
 * <b>Dificultad: Fácil</b>
 *
 * <p>Repositorio JPA para obtener métricas de inventario de un concesionario.
 * El método clave usa el verbo {@code countBy} para devolver el total de coches
 * de una marca sin necesidad de cargar las entidades en memoria.</p>
 *
 * <p><b>Estructura / Reglas:</b></p>
 * <ul>
 *   <li>Extiende {@link JpaRepository} sobre {@link CocheEnunciado} con clave {@link Long}.</li>
 *   <li>Debes añadir un Query Method que empiece por {@code countBy}.</li>
 *   <li>El retorno es {@code long} (primitivo) porque es un conteo agregado.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * long total = repository.countByMarca("Toyota");
 * // SQL generada (aprox.): SELECT COUNT(*) FROM coche_enunciado WHERE marca = 'Toyota'
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>El verbo {@code countBy<Campo>} hace que Spring Data genere un {@code COUNT(*)}.</li>
 *   <li>No devuelvas {@code List<...>}; devuelve {@code long} o {@code Long}.</li>
 * </ul>
 */
public interface CocheRepositoryEnunciado extends JpaRepository<CocheEnunciado, Long> {
    // TODO: Contar coches por marca
}
