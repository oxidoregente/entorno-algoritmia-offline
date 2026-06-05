package com.algoritmia.nivel04.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

/**
 * 🎓 RETO: Repositorio de Empresas (atributo embebido).
 * <b>Dificultad: Media</b>
 *
 * <p>Repositorio JPA que busca empresas filtrando por una propiedad de su
 * objeto embebido {@link DireccionEnunciado}. Esto demuestra cómo Spring
 * Data navega por las propiedades de objetos {@code @Embeddable} usando la
 * notación encadenada en el nombre del método.</p>
 *
 * <p><b>Estructura / Reglas:</b></p>
 * <ul>
 *   <li>Extiende {@link JpaRepository} sobre {@link EmpresaEnunciado} con clave {@link Long}.</li>
 *   <li>Debes añadir un Query Method que navegue por el atributo embebido: {@code findByDireccionCiudad(...)}.</li>
 *   <li>Spring Data traducirá esto a un {@code WHERE ciudad = ?} (porque está aplanado en la misma tabla).</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * List&lt;EmpresaEnunciado&gt; madrilenas = repository.findByDireccionCiudad("Madrid");
 * // -&gt; [ACME, BBVA, Inditex, ...]
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>{@code Direccion} es el nombre del campo en {@code EmpresaEnunciado}; {@code Ciudad} el campo en {@code DireccionEnunciado}.</li>
 *   <li>Si los nombres entran en ambigüedad puedes separarlos con guion bajo: {@code findByDireccion_Ciudad}.</li>
 * </ul>
 */
public interface EmpresaRepositoryEnunciado extends JpaRepository<EmpresaEnunciado, Long> {
    // TODO: Encontrar empresas por ciudad del objeto embebido
}
