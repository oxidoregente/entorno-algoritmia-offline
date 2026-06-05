package com.algoritmia.nivel09.testcontainers;

/**
 * 🎓 RETO: Propiedades Dinámicas ({@code @DynamicPropertySource}).
 * <b>Dificultad: Media</b>
 *
 * <p>Aprende a inyectar las URLs, puertos y credenciales de los contenedores
 * arrancados por Testcontainers en el contexto de Spring <i>en tiempo de
 * ejecución</i>. La anotación {@code @DynamicPropertySource} permite
 * registrar propiedades que se resuelven justo antes de crear el contexto,
 * lo cual es imprescindible cuando el puerto del contenedor se asigna de
 * forma dinámica (aleatoria).</p>
 *
 * <p><b>Reglas / Conceptos clave:</b></p>
 * <ul>
 *   <li>El método anotado debe ser {@code static} y aceptar un
 *       {@code DynamicPropertyRegistry}.</li>
 *   <li>Cada llamada a {@code registry.add("clave", supplier)} añade una
 *       propiedad a {@code SpringEnvironment}.</li>
 *   <li>El método se ejecuta antes de que Spring levante el contexto, por
 *       lo que el contenedor <b>debe</b> estar ya arrancado.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * static PostgreSQLContainer&lt;?&gt; postgres = new PostgreSQLContainer&lt;&gt;("postgres:15-alpine");
 *
 * static {
 *     postgres.start();
 * }
 *
 * &#64;DynamicPropertySource
 * static void registerProperties(DynamicPropertyRegistry registry) {
 *     registry.add("spring.datasource.url",      postgres::getJdbcUrl);
 *     registry.add("spring.datasource.username", postgres::getUsername);
 *     registry.add("spring.datasource.password", postgres::getPassword);
 * }
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>Usa <i>method references</i> ({@code postgres::getJdbcUrl}) para
 *       pasar un {@code Supplier} limpio al registro.</li>
 *   <li>El contenedor debe ser {@code static} para que esté disponible
 *       cuando se ejecute el método estático de {@code @DynamicPropertySource}.</li>
 *   <li>Es preferible a fijar puertos manualmente: el contenedor elegirá uno
 *       libre y se lo comunicaremos a Spring dinámicamente.</li>
 * </ul>
 */
public class TestcontainersDynamicPropsEnunciado {

    /**
     * Describe las instrucciones para implementar un método estático con
     * {@code @DynamicPropertySource} que inyecte propiedades dinámicas
     * del contenedor.
     *
     * @return String con las instrucciones del reto.
     */
    public String getInstrucciones() {
        return "Implementa un método estático con @DynamicPropertySource para asignar spring.datasource.url";
    }
}
