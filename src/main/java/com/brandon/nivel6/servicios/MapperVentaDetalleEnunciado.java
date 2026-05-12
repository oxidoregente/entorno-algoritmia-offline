package com.brandon.nivel6.servicios;

import com.brandon.nivel6.dto.VentaResumenDTO;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * RETO: Mapper de Ventas Consolidadas.
 * 
 * Dado una serie de datos de entrada (Venta e Items), consolida la información 
 * en un objeto de transporte de datos (DTO).
 */
@Service
public class MapperVentaDetalleEnunciado {

    public record ItemVenta(String producto, double precio) {}

    public VentaResumenDTO mapearAVentaDTO(Long idVenta, List<ItemVenta> items) {
        // TODO: Calcula la suma total de los precios
        // TODO: Extrae solo los nombres de los productos en una lista
        // TODO: Devuelve el Record VentaResumenDTO
        return null;
    }
}
