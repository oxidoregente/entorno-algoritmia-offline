package com.brandon.nivel6.servicios;

import com.brandon.nivel6.dto.VentaResumenDTO;
import java.util.List;
import java.util.stream.Collectors;

/**
 * SOLUCIÓN: Mapper de Ventas Consolidadas.
 */
public class MapperVentaDetalleSolucion {

    public record ItemVenta(String producto, double precio) {}

    public VentaResumenDTO mapearAVentaDTO(Long idVenta, List<ItemVenta> items) {
        double total = items.stream().mapToDouble(ItemVenta::precio).sum();
        
        List<String> nombres = items.stream()
                .map(ItemVenta::producto)
                .collect(Collectors.toList());

        return new VentaResumenDTO(idVenta, total, nombres);
    }
}
