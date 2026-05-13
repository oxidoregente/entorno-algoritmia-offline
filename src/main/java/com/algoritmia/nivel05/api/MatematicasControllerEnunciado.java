package com.algoritmia.nivel05.api;

import org.springframework.web.bind.annotation.*;
import java.util.Map;

/**
 * 🎓 RETO: API de Matemáticas con Validación.
 * <b>Dificultad: Media</b>
 * 
 * <p>Implementa un endpoint GET "/api/v1/sumar?a=5&b=10" que devuelva 
 * un JSON con el resultado.</p>
 * 
 * <p><b>Regla:</b> Si 'a' o 'b' son negativos, debe lanzar una 
 * IllegalArgumentException (que será capturada por el Global Exception Handler).</p>
 */
@RestController
@RequestMapping("/api/v1")
public class MatematicasControllerEnunciado {

    // TODO: Define el @GetMapping con @RequestParam
    public Map<String, Integer> sumar(int a, int b) {
        return null;
    }
}
