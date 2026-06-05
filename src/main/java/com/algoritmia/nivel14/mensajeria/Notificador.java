package com.algoritmia.nivel14.mensajeria;

/**
 * 🎓 INTERFAZ: Notificador (punto neutro entre niveles).
 * <b>Dificultad: Fácil</b>
 *
 * <p>Abstracción genérica para enviar notificaciones. Permite que el consumidor
 * de mensajes de RabbitMQ (nivel 14) publique avisos sin acoplarse a un canal
 * concreto (email, SMS, push, etc.).</p>
 *
 * <p><b>Patrón aplicado:</b> Inyección de Dependencias (DIP - Dependency Inversion Principle).
 * El nivel 14 depende de esta abstracción, no de una clase concreta de un nivel superior.</p>
 *
 * <p><b>Implementaciones:</b> {@code com.algoritmia.nivel20.notificaciones.ServicioEmailEnunciado}
 * implementa esta interfaz para enviar las notificaciones por correo electrónico.</p>
 *
 * <p><b>Para el estudiante:</b> No necesitas modificar este archivo. Solo
 * entiéndelo como el "contrato" que tu servicio de notificaciones debe cumplir
 * si quieres que el consumidor de RabbitMQ lo encuentre automáticamente.</p>
 */
public interface Notificador {

    /**
     * Envía una notificación simple.
     *
     * @param para   Destinatario de la notificación.
     * @param asunto Asunto o título de la notificación.
     * @param texto  Cuerpo del mensaje.
     */
    void enviarNotificacionSimple(String para, String asunto, String texto);
}
