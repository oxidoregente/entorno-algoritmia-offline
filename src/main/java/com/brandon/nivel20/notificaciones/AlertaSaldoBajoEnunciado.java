package com.brandon.nivel20.notificaciones;

import org.springframework.stereotype.Service;

/**
 * 🎓 RETO: Alerta de Saldo Bajo.
 * <b>Dificultad: Difícil</b>
 * 
 * <p>Implementa un servicio que evalúe el saldo de un cliente y envíe una 
 * alerta URGENTE si este baja de $10.</p>
 */
@Service
public class AlertaSaldoBajoEnunciado {

    private final ServicioEmailEnunciado emailService;

    public AlertaSaldoBajoEnunciado(ServicioEmailEnunciado emailService) {
        this.emailService = emailService;
    }

    public void verificarYNotificar(String usuario, String correo, double saldo) {
        // TODO: Si saldo < 10 -> Enviar email urgente
    }
}
