package com.algoritmia.nivel04.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

/**
 * 🎓 RETO: Repositorio de Estudiantes (pattern matching).
 * <b>Dificultad: Fácil</b>
 *
 * <p>Repositorio JPA para filtrar estudiantes cuyo email termine en un dominio
 * concreto. Se utiliza, por ejemplo, para listar todos los alumnos de una
 * universidad o detectar usuarios de un mismo proveedor de correo.</p>
 *
 * <p><b>Estructura / Reglas:</b></p>
 * <ul>
 *   <li>Extiende {@link JpaRepository} sobre {@link EstudianteEnunciado} con clave {@link Long}.</li>
 *   <li>Debes añadir un Query Method con el sufijo {@code EndingWith}.</li>
 *   <li>Spring Data lo traduce a un {@code LIKE '%dominio'} en SQL.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * List&lt;EstudianteEnunciado&gt; alumnosUAM =
 *     repository.findByEmailEndingWith("@uam.es");
 * // -&gt; [ana@uam.es, eva@uam.es, ...]
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>Variantes: {@code StartingWith}, {@code Containing}, {@code Like}.</li>
 *   <li>El parámetro NO debe llevar comodines: Spring los añade automáticamente.</li>
 * </ul>
 */
public interface EstudianteRepositoryEnunciado extends JpaRepository<EstudianteEnunciado, Long> {
    // TODO: Buscar estudiantes cuyo email termine en un dominio
    List<EstudianteEnunciado> findByEmailEndingWith(String dominio);
}
