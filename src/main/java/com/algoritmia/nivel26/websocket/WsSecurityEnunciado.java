package com.algoritmia.nivel26.websocket;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;

/**
 * 🎓 RETO: Seguridad en WebSockets.
 * <b>Dificultad: Difícil</b>
 *
 * <p>Una conexión WebSocket persistente es una puerta abierta al servidor
 * durante toda la sesión. Al igual que en HTTP, debes controlar quién puede
 * escribir en cada destino STOMP. Spring Security soporta anotaciones como
 * <code>@PreAuthorize</code> también en métodos <code>@MessageMapping</code>,
 * siempre que actives <code>@EnableGlobalMethodSecurity</code>.</p>
 *
 * <p><b>Reglas / Estructura / Conceptos clave:</b></p>
 * <ul>
 *   <li>Usa <code>@MessageMapping("/ruta")</code> para mapear el destino STOMP entrante.</li>
 *   <li>Combínalo con <code>@PreAuthorize("hasRole('...')")</code> para restringir el acceso.</li>
 *   <li>El payload se recibe con <code>@Payload</code> y el usuario con <code>@Principal</code> si lo necesitas.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * # Cliente (JS)
 * stompClient.send("/app/admin-chat", {}, "Hola admins");
 *
 * # Server (Java)
 * @MessageMapping("/admin-chat")
 * @PreAuthorize("hasRole('ADMIN')")
 * public void chatAdmin(@Payload String mensaje) { ... }
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>Asegúrate de anotar la clase con <code>@EnableWebSocketSecurity</code> o equivalente en tu config.</li>
 *   <li>El usuario sin rol ADMIN obtendrá un <code>AccessDeniedException</code> que el cliente verá como cierre de sesión.</li>
 * </ul>
 */
@Controller
public class WsSecurityEnunciado {

    /**
     * Endpoint STOMP protegido al que solo usuarios con rol ADMIN pueden enviar mensajes.
     *
     * @param mensaje Contenido del mensaje enviado por el cliente autenticado.
     */
    @MessageMapping("/admin-chat")
    @PreAuthorize("hasRole('ADMIN')")
    public void chatAdmin(@Payload String mensaje) {
        // TODO: Asegúrate de que solo usuarios con rol ADMIN puedan
        // enviar mensajes a este destino.
    }
}
