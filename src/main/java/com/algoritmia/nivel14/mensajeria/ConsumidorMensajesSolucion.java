package com.algoritmia.nivel14.mensajeria;

/**
 * SOLUCIÓN: Consumidor de Mensajes.
 *
 * <p>Teoría:
 * El consumidor de RabbitMQ es el destino final del flujo asíncrono. En lugar
 * de acoplarse a un canal de notificación concreto (email, SMS), depende
 * de la abstracción {@link Notificador}. Spring resolverá automáticamente
 * qué implementación inyectar (por ejemplo, {@code ServicioEmailEnunciado}
 * del nivel 20 si está presente en el classpath).</p>
 */
public class ConsumidorMensajesSolucion {

    private final Notificador notificador;

    public ConsumidorMensajesSolucion(Notificador notificador) {
        this.notificador = notificador;
    }

    public void recibirMensaje(String mensaje) {
        notificador.enviarNotificacionSimple("admin@ingenieria.com", "Evento", mensaje);
    }
}
