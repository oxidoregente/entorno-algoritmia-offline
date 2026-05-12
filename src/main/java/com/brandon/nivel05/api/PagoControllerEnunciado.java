package com.brandon.nivel05.api;

import com.brandon.nivel03.servicios.ProcesadorPagosFintechEnunciado;
import com.brandon.nivel03.servicios.ProcesadorPagosFintechEnunciado.TipoTarjeta;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

/**
 * RETO: Pago Controller.
 * 
 * Implementa el endpoint REST para calcular comisiones.
 * El estudiante debe definir las anotaciones de mapeo (@GetMapping, @RequestParam).
 */
@RestController
@RequestMapping("/api/v1/pagos")
@Tag(name = "Pagos", description = "Endpoints para la gestión y cálculo de comisiones fintech")
public class PagoControllerEnunciado {

    private final ProcesadorPagosFintechEnunciado procesador;

    public PagoControllerEnunciado(ProcesadorPagosFintechEnunciado procesador) {
        this.procesador = procesador;
    }

    @GetMapping("/comision")
    @Operation(summary = "Calcular comisión", description = "Calcula la comisión basada en el monto y el tipo de tarjeta")
    public Map<String, Object> obtenerComision(
            @RequestParam double monto,
            @RequestParam TipoTarjeta tipo) {
        
        // TODO: Invocar al procesador y devolver un Mapa con los resultados
        return null;
    }
}
