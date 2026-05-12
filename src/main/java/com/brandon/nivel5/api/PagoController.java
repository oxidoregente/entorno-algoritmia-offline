package com.brandon.nivel5.api;

import com.brandon.nivel3.servicios.ProcesadorPagosFintechEnunciado;
import com.brandon.nivel3.servicios.ProcesadorPagosFintechEnunciado.TipoTarjeta;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * Nivel 5: Integración y Exposición (API REST).
 * 
 * Aquí demostramos cómo unir las piezas anteriores.
 * Un Controller es la "puerta de entrada" a nuestra aplicación.
 */
@RestController
@RequestMapping("/api/v1/pagos")
@Tag(name = "Pagos", description = "Endpoints para la gestión y cálculo de comisiones fintech")
public class PagoController {

    private final ProcesadorPagosFintechEnunciado procesador;

    // Inyección por constructor (Práctica recomendada en Spring)
    public PagoController(ProcesadorPagosFintechEnunciado procesador) {
        this.procesador = procesador;
    }

    /**
     * Endpoint para simular un cálculo de comisión.
     * Ejemplo de uso: GET /api/v1/pagos/comision?monto=100&tipo=CREDITO
     */
    @GetMapping("/comision")
    @Operation(summary = "Calcular comisión", description = "Calcula la comisión basada en el monto y el tipo de tarjeta")
    public Map<String, Object> obtenerComision(
            @RequestParam double monto,
            @RequestParam TipoTarjeta tipo) {
        
        double comision = procesador.calcularComision(monto, tipo);
        
        return Map.of(
            "montoOriginal", monto,
            "tipoTarjeta", tipo,
            "comisionCalculada", comision,
            "total", monto + comision,
            "mensaje", "Cálculo realizado exitosamente"
        );
    }
}
