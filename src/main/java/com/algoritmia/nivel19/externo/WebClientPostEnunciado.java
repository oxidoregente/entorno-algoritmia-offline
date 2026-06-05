package com.algoritmia.nivel19.externo;

import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

/**
 * 🎓 RETO: Peticiones POST con WebClient.
 * <b>Dificultad: Media</b>
 *
 * <p>El método GET sirve para <b>leer</b> recursos, pero la
 * mayoría de integraciones reales requieren <b>enviar</b>
 * datos: registrar un pedido, crear un usuario, publicar
 * un webhook, etc. WebClient soporta verbos HTTP a través
 * de métodos encadenados ({@code .post()}, {@code .put()},
 * {@code .delete()}) y serializa el cuerpo a JSON
 * automáticamente si Jackson está en el classpath.</p>
 *
 * <p><b>Reglas / Estructura / Conceptos clave:</b></p>
 * <ul>
 *   <li>Usar {@code .post()} para iniciar una llamada POST, seguido de {@code .uri(...)}
 *       con la ruta del recurso.</li>
 *   <li>Pasar el cuerpo con {@code .bodyValue(objeto)}; Jackson lo serializa a JSON y
 *       aplica {@code Content-Type: application/json} automáticamente.</li>
 *   <li>Llamar a {@code .retrieve().bodyToMono(Tipo.class)} para obtener la respuesta
 *       ya deserializada.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * public class WebClientPostEnunciado {
 *     private final WebClient webClient;
 *
 *     public WebClientPostEnunciado(WebClient.Builder builder) {
 *         this.webClient = builder.baseUrl("https://api.ejemplo.com").build();
 *     }
 *
 *     public Mono&lt;String&gt; enviarDatos(Object body) {
 *         return webClient.post()
 *                 .uri("/recurso")
 *                 .bodyValue(body)
 *                 .retrieve()
 *                 .bodyToMono(String.class);
 *     }
 * }
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>Si el endpoint espera un DTO específico, declara el parámetro como ese tipo
 *       concreto en lugar de {@code Object} para type-safety.</li>
 *   <li>Para enviar headers personalizados usa
 *       {@code .header("Authorization", "Bearer " + token)} antes de {@code .bodyValue(...)}.</li>
 * </ul>
 */
public class WebClientPostEnunciado {

    private final WebClient webClient;

    public WebClientPostEnunciado(WebClient.Builder builder) {
        this.webClient = builder.baseUrl("https://api.ejemplo.com").build();
    }

    /**
     * Envía un cuerpo JSON a la API externa mediante POST.
     *
     * @param body objeto que se serializará como cuerpo de la petición
     * @return {@code Mono} reactivo con la respuesta del servidor como cadena
     */
    public Mono<String> enviarDatos(Object body) {
        // TODO: Usa webClient.post(), define el bodyValue y recupera el bodyToMono(String.class)
        return null;
    }
}
