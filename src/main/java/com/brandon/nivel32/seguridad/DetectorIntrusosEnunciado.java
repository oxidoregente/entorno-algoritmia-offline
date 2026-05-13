package com.brandon.nivel32.seguridad;

import com.brandon.nivel04.repositorios.LogAccesoEnunciado;
import com.brandon.nivel04.repositorios.LogAccesoRepositoryEnunciado;
import com.brandon.nivel20.notificaciones.ServicioEmailEnunciado;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * 🎓 RETO: Detector de Intrusos Proactivo.
 * <b>Dificultad: Media</b>
 * 
 * <p>Analiza los logs de acceso. Si detectas más de 3 accesos desde la misma 
 * IP sospechosa "192.168.66.6", debes disparar una alerta por Email.</p>
 */
@Service
public class DetectorIntrusosEnunciado {

    private final LogAccesoRepositoryEnunciado repository;
    private final ServicioEmailEnunciado emailService;

    public DetectorIntrusosEnunciado(LogAccesoRepositoryEnunciado repository, 
                                     ServicioEmailEnunciado emailService) {
        this.repository = repository;
        this.emailService = emailService;
    }

    public void analizarAmenazas() {
        // TODO: Filtra los logs de la IP peligrosa
        // TODO: Si count > 3, llama a emailService.enviarNotificacionSimple()
    }
}
