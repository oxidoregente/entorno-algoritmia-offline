package com.algoritmia.nivel09.testcontainers;

/**
 * 🎓 RETO: Testcontainers con Redis.
 * <b>Dificultad: Difícil</b>
 *
 * <p>Configura un contenedor de Redis para validar la lógica de caché en un
 * entorno real. De esta forma tus tests cubren exactamente el mismo binario
 * que se desplegará en producción, evitando los clásicos
 * <i>"en local funciona, en producción no"</i>.</p>
 *
 * <p><b>Reglas / Conceptos clave:</b></p>
 * <ul>
 *   <li>Usa {@code GenericContainer("redis:7-alpine")} para instanciar el
 *       contenedor genérico de Redis.</li>
 *   <li>Expón el puerto {@code 6379} (puerto por defecto de Redis) y
 *       mapea dinámicamente con {@code getMappedPort(6379)}.</li>
 *   <li>Registra la propiedad {@code spring.data.redis.host} y
 *       {@code spring.data.redis.port} mediante
 *       {@code @DynamicPropertySource}.</li>
 *   <li>Asegúrate de que la imagen {@code redis:7-alpine} está disponible
 *       en tu entorno Docker.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * &#64;Container
 * static GenericContainer&lt;?&gt; redis = new GenericContainer&lt;&gt;("redis:7-alpine")
 *         .withExposedPorts(6379);
 *
 * &#64;DynamicPropertySource
 * static void props(DynamicPropertyRegistry registry) {
 *     registry.add("spring.data.redis.host", redis::getHost);
 *     registry.add("spring.data.redis.port", () -&gt; redis.getMappedPort(6379));
 * }
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>{@code getMappedPort(6379)} devuelve el puerto aleatorio que Docker
 *       ha mapeado al {@code 6379} interno del contenedor.</li>
 *   <li>Redis no tiene credenciales por defecto; no hace falta
 *       {@code username}/{@code password} salvo que montes un Redis con
 *       ACLs.</li>
 *   <li>Si quieres usar un cliente real (Lettuce/Jedis), asegúrate de que
 *       la versión del driver es compatible con Redis 7.</li>
 * </ul>
 */
public class TestcontainersRedisEnunciado {

    /**
     * Describe las instrucciones para configurar un contenedor Redis con
     * Testcontainers para validar la lógica de caché.
     *
     * @return String con las instrucciones del reto.
     */
    public String getInstrucciones() {
        return "Usa GenericContainer(\"redis:7-alpine\") y mapea el puerto 6379";
    }
}
