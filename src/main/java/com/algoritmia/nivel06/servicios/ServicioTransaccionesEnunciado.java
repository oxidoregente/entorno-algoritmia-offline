package com.algoritmia.nivel06.servicios;

import com.algoritmia.nivel04.repositorios.TransaccionEnunciado;
import com.algoritmia.nivel04.repositorios.TransaccionRepositoryEnunciado;
import com.algoritmia.nivel06.dto.TransaccionDTO;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * 🎓 RETO: Servicio de Transacciones con DTO.
 * <b>Dificultad: Media</b>
 *
 * <p>Este servicio debe transformar las entidades de base de datos a DTOs (Records)
 * y validar reglas de negocio.</p>
 *
 * <p><b>Requerimientos:</b></p>
 * <ol>
 *   <li>Recuperar todas las transacciones del repositorio.</li>
 *   <li>Validar que ningún monto sea negativo (lanzar ErrorDeNegocioException si lo hay).</li>
 *   <li>Mapear cada entidad a TransaccionDTO usando Java 21 Records.</li>
 * </ol>
 */
@Service
public class ServicioTransaccionesEnunciado {

    private final TransaccionRepositoryEnunciado repositorio;

    public ServicioTransaccionesEnunciado(TransaccionRepositoryEnunciado repositorio) {
        this.repositorio = repositorio;
    }

    /**
     * Obtiene el historial seguro de transacciones, validando montos y mapeando a DTOs.
     *
     * @return Lista de TransaccionDTO.
     * @throws ErrorDeNegocioException Si alguna transacción tiene monto negativo.
     */
    public List<TransaccionDTO> obtenerHistorialSeguro() {
        // TODO: Recuperar, validar y mapear transacciones
        return null;
    }
}
