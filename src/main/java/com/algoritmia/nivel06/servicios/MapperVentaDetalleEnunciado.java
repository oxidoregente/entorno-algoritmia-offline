package com.algoritmia.nivel06.servicios;

import com.algoritmia.nivel06.dto.VentaResumenDTO;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * 🎓 RETO: Mapper de Ventas Consolidadas.
 * <b>Dificultad: Media</b>
 *
 * <p>Dado un ID de venta y una lista de items, consolida la información
 * en un objeto DTO de tipo `VentaResumenDTO`.</p>
 *
 * <p><b>Requerimientos:</b></p>
 * <ol>
 *   <li>Calcular la suma total de los precios de todos los items.</li>
 *   <li>Extraer solo los nombres de los productos en una lista.</li>
 *   <li>Devolver un Record VentaResumenDTO con los datos consolidados.</li>
 * </ol>
 */
@Service
public class MapperVentaDetalleEnunciado {

    public record ItemVenta(String producto, double precio) {}

    /**
     * Convierte una venta con sus items en un DTO resumen.
     *
     * @param idVenta Identificador de la venta.
     * @param items   Lista de items de la venta.
     * @return VentaResumenDTO con los datos consolidados.
     */
    public VentaResumenDTO mapearAVentaDTO(Long idVenta, List<ItemVenta> items) {
        // TODO: Calcula total y extrae nombres
        return null;
    }
}
