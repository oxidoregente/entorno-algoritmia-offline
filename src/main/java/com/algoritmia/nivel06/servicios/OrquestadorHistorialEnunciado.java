package com.algoritmia.nivel06.servicios;

import com.algoritmia.nivel04.repositorios.TransaccionEnunciado;
import com.algoritmia.nivel06.dto.TransaccionDTO;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * 🎓 RETO: Orquestador de Mappers de Historial.
 * <b>Dificultad: Difícil</b>
 * 
 * <p>Implementa un servicio que mapee una LISTA de entidades a una LISTA de DTOs 
 * realizando un cálculo de "impuesto proyectado" en cada objeto.</p>
 */
@Service
public class OrquestadorHistorialEnunciado {

    public List<TransaccionDTO> procesarHistorial(List<TransaccionEnunciado> entidades) {
        // TODO: Mapear lista usando streams
        // TODO: El mensaje informativo del DTO debe decir "Impuesto: " + (monto * 0.15)
        return null;
    }
}
