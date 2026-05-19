package com.algoritmia.nivel20.notificaciones;

import org.springframework.stereotype.Service;

/**
 * 🎓 RETO: Servicio de Notificaciones.
 * <b>Dificultad: Fácil</b>
 *
 * <p>Implementa un servicio base para el envío de notificaciones
 * por correo electrónico. En esta simulación, las notificaciones
 * se imprimen por consola con un formato profesional.</p>
 *
 * <p>Este servicio es utilizado por otros componentes del nivel 20
 * como {@link com.algoritmia.nivel20.notificaciones.ServicioBienvenidaEnunciado}
 * y {@link com.algoritmia.nivel20.notificaciones.AlertaSaldoBajoEnunciado}.</p>
 */
@Service
public class ServicioEmailEnunciado {

    /**
     * Envía una notificación de correo simulada (se imprime por consola).
     *
     * @param para   Dirección de correo del destinatario.
     * @param asunto Asunto del mensaje.
     * @param texto  Cuerpo del mensaje en texto plano.
     */
    public void enviarNotificacionSimple(String para, String asunto, String texto) {
        // TODO: Simular envío imprimiendo en consola con formato profesional
    }
}
