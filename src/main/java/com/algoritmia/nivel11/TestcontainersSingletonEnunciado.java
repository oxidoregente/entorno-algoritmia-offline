package com.algoritmia.nivel11;

/**
 * 🎓 RETO: Patrón Singleton (Reutilización de Contenedores).
 * <b>Dificultad: Difícil</b>
 *
 * <p>Optimiza el tiempo de tus tests reutilizando la misma instancia de
 * contenedor para múltiples clases de prueba. Sin este patrón, cada
 * clase de test arranca y detiene su propio contenedor, multiplicando el
 * tiempo total de la suite. Con el patrón Singleton, el contenedor se
 * levanta <b>una sola vez</b> por ejecución y se comparte entre todos los
 * tests.</p>
 *
 * <p><b>Reglas / Conceptos clave:</b></p>
 * <ul>
 *   <li>Crea una clase base abstracta (por ejemplo
 *       {@code AbstractIntegrationTest}) con un contenedor {@code static}.</li>
 *   <li>Usa un bloque {@code static { ... }} para iniciar el contenedor
 *       una sola vez cuando se cargue la clase.</li>
 *   <li>El método anotado con {@code @DynamicPropertySource} también debe
 *       ser {@code static}.</li>
 *   <li>Las clases de test concretos deben extender la base para heredar
 *       el contenedor ya arrancado.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * public abstract class AbstractPostgresTest {
 *
 *     static final PostgreSQLContainer&lt;?&gt; POSTGRES =
 *             new PostgreSQLContainer&lt;&gt;("postgres:15-alpine");
 *
 *     static {
 *         POSTGRES.start();
 *     }
 *
 *     &#64;DynamicPropertySource
 *     static void register(DynamicPropertyRegistry registry) {
 *         registry.add("spring.datasource.url",      POSTGRES::getJdbcUrl);
 *         registry.add("spring.datasource.username", POSTGRES::getUsername);
 *         registry.add("spring.datasource.password", POSTGRES::getPassword);
 *     }
 * }
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>El contenedor se inicia en el bloque {@code static}, que se ejecuta
 *       una sola vez por ClassLoader.</li>
 *   <li>El contenedor se detiene automáticamente al finalizar toda la
 *       suite de tests (gracias al shutdown hook de Testcontainers).</li>
 *   <li>Si necesitas resetear el estado entre tests (por ejemplo, vaciar las
 *       tablas), añade un {@code @BeforeEach} en la clase base.</li>
 * </ul>
 */
public class TestcontainersSingletonEnunciado {

    /**
     * Describe las instrucciones para crear una clase base abstracta que
     * reutilice la misma instancia de contenedor en múltiples pruebas.
     *
     * @return String con las instrucciones del reto.
     */
    public String getInstrucciones() {
        return "Crea una clase base abstracta que inicie el contenedor una sola vez de forma estática";
    }
}
