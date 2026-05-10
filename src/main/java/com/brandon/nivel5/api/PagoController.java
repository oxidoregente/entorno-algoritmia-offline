package com.brandon.nivel5.api;

import com.brandon.nivel3.servicios.ProcesadorPagosFintech;
import com.brandon.nivel3.servicios.ProcesadorPagosFintech.TipoTarjeta;
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
public class PagoController {

    private final ProcesadorPagosFintech procesador;

    // Inyección por constructor (Práctica recomendada en Spring)
    public PagoController(ProcesadorPagosFintech procesador) {
        this.procesador = procesador;
    }

    /**
     * Endpoint para simular un cálculo de comisión.
     * Ejemplo de uso: GET /api/v1/pagos/comision?monto=100&tipo=CREDITO
     */
    @GetMapping("/comision")
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
