package com.algoritmia.nivel04.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

/**
 * 🎓 RETO: Repositorio de Cursos (Consulta JPQL personalizada).
 * <b>Dificultad: Difícil</b>
 *
 * <p>Repositorio JPA que necesita escribir una consulta {@link Query JPQL} a
 * mano porque Spring Data no puede derivar la operación "filtrar por tamaño
 * de colección" desde el nombre del método. Útil para listar cursos que
 * superan un umbral de inscripciones (cursos "populares").</p>
 *
 * <p><b>Estructura / Reglas:</b></p>
 * <ul>
 *   <li>Extiende {@link JpaRepository} sobre {@link CursoEnunciado} con clave {@link Long}.</li>
 *   <li>Debes añadir un método anotado con {@code @Query} usando JPQL.</li>
 *   <li>Usa la función {@code SIZE(...)} para acceder al tamaño de {@code alumnos}.</li>
 *   <li>El método recibe un {@code int} mínimo y devuelve {@code List<CursoEnunciado>}.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * &#64;Query("SELECT c FROM CursoEnunciado c WHERE SIZE(c.alumnos) &gt; ?1")
 * List&lt;CursoEnunciado&gt; encontrarCursosPopulares(int minimo);
 *
 * // Uso:
 * List&lt;CursoEnunciado&gt; populares = repository.encontrarCursosPopulares(3);
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>En JPQL se nombran las entidades por clase Java, no por nombre de tabla.</li>
 *   <li>El parámetro posicional se referencia con {@code ?1}, {@code ?2}...</li>
 *   <li>Alternativamente puedes usar parámetros nombrados con {@code :minimo} y {@code @Param}.</li>
 * </ul>
 */
public interface CursoRepositoryEnunciado extends JpaRepository<CursoEnunciado, Long> {
    // TODO: Consulta JPQL para encontrar cursos populares
    @Query("SELECT c FROM CursoEnunciado c")
    List<CursoEnunciado> encontrarCursosPopulares(int limite);
}
