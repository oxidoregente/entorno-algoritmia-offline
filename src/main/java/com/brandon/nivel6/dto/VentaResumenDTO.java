package com.brandon.nivel6.dto;

import java.util.List;

/**
 * Record para el reto de consolidación de ventas.
 */
public record VentaResumenDTO(
    Long ventaId,
    Double totalCalculado,
    List<String> productosConcat
) {}
