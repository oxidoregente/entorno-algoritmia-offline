package com.algoritmia.nivel20.notificaciones;

/**
 * 🏆 SOLUCIÓN: Alerta de Saldo Bajo.
 */
public class AlertaSaldoBajoSolucion {

    private final ServicioEmailEnunciado emailService;

    public AlertaSaldoBajoSolucion(ServicioEmailEnunciado emailService) {
        this.emailService = emailService;
    }

    public void verificarYNotificar(String usuario, String correo, double saldo) {
        if (saldo < 10.0) {
            String msg = "¡URGENTE! Su saldo de $" + saldo + " es demasiado bajo.";
            emailService.enviarNotificacionSimple(correo, "Alerta de Saldo", msg);
        }
    }
}
