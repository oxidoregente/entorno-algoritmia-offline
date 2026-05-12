package com.brandon.nivel14.mensajeria;

/**
 * 🏆 SOLUCIÓN: Filtro de Mensajes Prioritarios.
 */
public class FiltroMensajesPrioritariosSolucion {

    public void procesar(String mensaje) {
        if (mensaje != null && mensaje.toUpperCase().contains("URGENTE")) {
            System.out.println(">> [ALERTA] Mensaje prioritario recibido: " + mensaje);
        }
    }
}
