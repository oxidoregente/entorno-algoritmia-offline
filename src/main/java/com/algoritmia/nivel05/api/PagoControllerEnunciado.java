package com.algoritmia.nivel05.api;

import com.algoritmia.nivel03.servicios.ProcesadorPagosFintechEnunciado;
import com.algoritmia.nivel03.servicios.ProcesadorPagosFintechEnunciado.TipoTarjeta;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

/**
 * 🎓 RETO: Controlador de Pagos (Comisiones).
 * <b>Dificultad: Fácil</b>
 *
 * <p>Implementa un endpoint REST para calcular comisiones de transacciones
 * utilizando el servicio `ProcesadorPagosFintechEnunciado`.</p>
 *
 * <h3>Endpoint:</h3>
 * <p><code>GET /api/v1/pagos/comision?monto=1000&tipo=CREDITO</code></p>
 *
 * <p><b>Pistas:</b></p>
 * <ul>
 *   <li>Usa @GetMapping y @RequestParam para capturar los parámetros.</li>
 *   <li>Invoca al procesador y devuelve un Map con los resultados (monto, tipo, comisión calculada).</li>
 * </ul>
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

        // TODO: Invocar al procesador y devolver un Map con los resultados
        return null;
    }
}
