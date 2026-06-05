package com.algoritmia.nivel09.testcontainers;

/**
 * 🎓 RETO: Testcontainers con PostgreSQL.
 * <b>Dificultad: Difícil</b>
 *
 * <p>Configura un contenedor de PostgreSQL para usarlo en tus pruebas de
 * integración. Debes declarar el contenedor, arrancarlo y registrar sus
 * propiedades dinámicas en el contexto de Spring para que la aplicación se
 * conecte a la base de datos <i>real</i> levantada por Testcontainers.</p>
 *
 * <p><b>Reglas / Conceptos clave:</b></p>
 * <ul>
 *   <li>Usa la clase {@code PostgreSQLContainer<>("postgres:15-alpine")}
 *       para instanciar el contenedor.</li>
 *   <li>Anota el campo con {@code @Container} para que JUnit gestione su
 *       ciclo de vida (start/stop).</li>
 *   <li>Combínalo con {@code @DynamicPropertySource} para que
 *       {@code spring.datasource.url}, {@code username} y {@code password}
 *       apunten al contenedor arrancado.</li>
 *   <li>Esta técnica sustituye a H2 o a bases de datos embebidas y permite
 *       probar contra el motor real.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * &#64;Container
 * static PostgreSQLContainer&lt;?&gt; postgres = new PostgreSQLContainer&lt;&gt;("postgres:15-alpine");
 *
 * &#64;DynamicPropertySource
 * static void props(DynamicPropertyRegistry registry) {
 *     registry.add("spring.datasource.url",      postgres::getJdbcUrl);
 *     registry.add("spring.datasource.username", postgres::getUsername);
 *     registry.add("spring.datasource.password", postgres::getPassword);
 * }
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>La dependencia {@code testcontainers-postgresql} debe estar en el
 *       {@code pom.xml} (incluida en este proyecto).</li>
 *   <li>Si quieres reutilizar el contenedor entre varias clases, considera
 *       el patrón Singleton (reto siguiente).</li>
 *   <li>{@code PostgreSQLContainer} ya expone
 *       {@code getJdbcUrl()}, {@code getUsername()} y {@code getPassword()}
 *       listos para usar.</li>
 * </ul>
 */
public class TestcontainersPostgresEnunciado {

    // En este reto, el estudiante debe implementar la lógica en una clase de Test,
    // pero aquí definimos la estructura de lo que se busca.

    /**
     * Describe las instrucciones para configurar un contenedor PostgreSQL
     * con Testcontainers e inyectar sus propiedades en Spring.
     *
     * @return String con las instrucciones del reto.
     */
    public String getInstrucciones() {
        return "Usa @Container y @DynamicPropertySource para configurar PostgreSQLContainer";
    }
}
