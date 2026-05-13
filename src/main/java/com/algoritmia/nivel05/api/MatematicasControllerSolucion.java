package com.algoritmia.nivel05.api;

import org.springframework.web.bind.annotation.*;
import java.util.Map;

/**
 * 🏆 SOLUCIÓN: API de Matemáticas.
 */
public class MatematicasControllerSolucion {

    @GetMapping("/sumar")
    public Map<String, Integer> sumar(@RequestParam int a, @RequestParam int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Los números deben ser positivos");
        }
        return Map.of("resultado", a + b);
    }
}
