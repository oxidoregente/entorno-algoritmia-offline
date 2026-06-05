package com.algoritmia.nivel17.notificaciones;

import com.algoritmia.nivel16.mensajeria.Notificador;
import org.springframework.stereotype.Service;

/**
 * 🎓 RETO: Servicio de Notificaciones.
 * <b>Dificultad: Fácil</b>
 *
 * <p>Implementa un servicio base para el envío de notificaciones
 * por correo electrónico. En esta simulación, las notificaciones
 * se imprimen por consola con un formato profesional.</p>
 *
 * <p><b>Implementa {@link Notificador}:</b> Este servicio implementa la interfaz
 * definida en el nivel 14, lo que permite que el consumidor de RabbitMQ lo
 * inyecte automáticamente sin acoplarse a esta clase concreta.</p>
 *
 * <p>Este servicio es utilizado por otros componentes del nivel 20
 * como {@link ServicioBienvenidaEnunciado} y {@link AlertaSaldoBajoEnunciado}.</p>
 */
@Service
public class ServicioEmailEnunciado implements Notificador {

    /**
     * Envía una notificación de correo simulada (se imprime por consola).
     *
     * @param para   Dirección de correo del destinatario.
     * @param asunto Asunto del mensaje.
     * @param texto  Cuerpo del mensaje en texto plano.
     */
    @Override
    public void enviarNotificacionSimple(String para, String asunto, String texto) {
        // TODO: Simular envío imprimiendo en consola con formato profesional
    }
}
