package com.algoritmia.nivel05.api;

import org.springframework.web.bind.annotation.*;
import java.util.Map;

/**
 * 🎓 RETO: API de Matemáticas con Validación.
 * <b>Dificultad: Media</b>
 *
 * <p>Implementa un endpoint GET que reciba dos números y devuelva su suma en formato JSON.</p>
 *
 * <h3>Endpoint:</h3>
 * <p><code>GET /api/v1/sumar?a=5&amp;b=10</code></p>
 *
 * <p><b>Regla de negocio:</b> Si 'a' o 'b' son negativos, debe lanzar una
 * `IllegalArgumentException` (que será capturada por un `@ControllerAdvice` global).</p>
 *
 * <p><b>Pistas:</b></p>
 * <ul>
 *   <li>Usa @GetMapping("/sumar") y @RequestParam para cada parámetro.</li>
 *   <li>Devuelve un Map con clave "resultado" y el valor de la suma.</li>
 * </ul>
 */
@RestController
@RequestMapping("/api/v1")
public class MatematicasControllerEnunciado {

    /**
     * Suma dos números enteros y devuelve el resultado.
     *
     * @param a Primer sumando (debe ser >= 0).
     * @param b Segundo sumando (debe ser >= 0).
     * @return Map con el resultado de la suma.
     * @throws IllegalArgumentException Si a o b son negativos.
     */
    // TODO: Define el @GetMapping con @RequestParam
    public Map<String, Integer> sumar(int a, int b) {
        return null;
    }
}
