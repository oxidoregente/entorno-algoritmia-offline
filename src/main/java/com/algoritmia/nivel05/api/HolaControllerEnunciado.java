package com.algoritmia.nivel05.api;

import org.springframework.web.bind.annotation.*;

/**
 * 🎓 RETO: Controlador de Saludos con Parámetros.
 * <b>Dificultad: Fácil</b>
 *
 * <p>Implementa un controlador REST en Spring Boot que exponga un endpoint GET
 * para saludar a un usuario de forma personalizada. El nombre del usuario debe
 * ser capturado de la URL como un parámetro de ruta.</p>
 *
 * <h3>Endpoint a implementar:</h3>
 * <p><code>GET /api/v1/hola/{nombre}</code></p>
 *
 * <h3>Comportamiento esperado:</h3>
 * <p>El endpoint debe devolver una cadena de texto que incluya el nombre proporcionado
 * en la ruta, con un mensaje de bienvenida.</p>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * Petición: GET /api/v1/hola/UsuarioPrueba
 * Respuesta: "Hola UsuarioPrueba, bienvenido al laboratorio"
 * </pre>
 *
 * <p><b>Pistas:</b></p>
 * <ul>
 *   <li>Usa las anotaciones `@RestController`, `@RequestMapping`, `@GetMapping` y `@PathVariable` de Spring.</li>
 *   <li>El `@RequestMapping` a nivel de clase define la base de la URL para todos los métodos del controlador.</li>
 *   <li>`@PathVariable` se utiliza para extraer valores de la plantilla URI.</li>
 * </ul>
 */
@RestController
@RequestMapping("/api/v1")
public class HolaControllerEnunciado {

    /**
     * Maneja las peticiones GET a "/hola/{nombre}" y devuelve un saludo personalizado.
     *
     * @param nombre El nombre del usuario, extraído de la ruta de la URL.
     * @return Un String con el mensaje de saludo personalizado.
     */
    // TODO: Define el @GetMapping con @PathVariable
    public String saludar(String nombre) {
        return null;
    }
}
