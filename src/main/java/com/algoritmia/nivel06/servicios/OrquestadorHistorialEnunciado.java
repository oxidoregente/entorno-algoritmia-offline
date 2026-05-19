package com.algoritmia.nivel06.servicios;

import com.algoritmia.nivel04.repositorios.TransaccionEnunciado;
import com.algoritmia.nivel06.dto.TransaccionDTO;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * 🎓 RETO: Orquestador de Mappers de Historial.
 * <b>Dificultad: Difícil</b>
 *
 * <p>Implementa un servicio que mapee una lista de entidades `TransaccionEnunciado`
 * a una lista de DTOs `TransaccionDTO`, calculando un "impuesto proyectado"
 * para cada transacción.</p>
 *
 * <p><b>Requerimientos:</b></p>
 * <ol>
 *   <li>Mapear cada entidad a TransaccionDTO usando streams.</li>
 *   <li>El mensaje informativo del DTO debe incluir: "Impuesto: " + (monto * 0.15).</li>
 * </ol>
 */
@Service
public class OrquestadorHistorialEnunciado {

    /**
     * Procesa una lista de entidades y las mapea a DTOs con impuesto proyectado.
     *
     * @param entidades Lista de entidades TransaccionEnunciado.
     * @return Lista de TransaccionDTO con el impuesto calculado.
     */
    public List<TransaccionDTO> procesarHistorial(List<TransaccionEnunciado> entidades) {
        // TODO: Mapear lista usando streams con cálculo de impuesto
        return null;
    }
}
