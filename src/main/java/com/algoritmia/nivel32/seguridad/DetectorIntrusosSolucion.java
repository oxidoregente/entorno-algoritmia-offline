package com.algoritmia.nivel32.seguridad;

import com.algoritmia.nivel04.repositorios.LogAccesoEnunciado;
import com.algoritmia.nivel04.repositorios.LogAccesoRepositoryEnunciado;
import com.algoritmia.nivel20.notificaciones.ServicioEmailEnunciado;

/**
 * 🏆 SOLUCIÓN: Detector de Intrusos.
 */
public class DetectorIntrusosSolucion {

    private final LogAccesoRepositoryEnunciado repository;
    private final ServicioEmailEnunciado emailService;

    public DetectorIntrusosSolucion(LogAccesoRepositoryEnunciado repository, 
                                   ServicioEmailEnunciado emailService) {
        this.repository = repository;
        this.emailService = emailService;
    }

    public void analizarAmenazas() {
        long sospechosos = repository.findAll().stream()
                .filter(log -> "192.168.66.6".equals(log.getIp()))
                .count();

        if (sospechosos > 3) {
            emailService.enviarNotificacionSimple("security@empresa.com", "ALERTA INTRUSO", "IP Bloqueada");
        }
    }
}
