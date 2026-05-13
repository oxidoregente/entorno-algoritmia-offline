package com.algoritmia.nivel05.api;

import org.springframework.web.bind.annotation.*;

/**
 * 🎓 RETO: Controlador de Saludos con Parámetros.
 * <b>Dificultad: Fácil</b>
 * 
 * <p>Implementa un endpoint GET "/api/v1/hola/{nombre}" que devuelva 
 * un saludo personalizado.</p>
 * 
 * <p>Ejemplo: "/api/v1/hola/UsuarioPrueba" -> "Hola UsuarioPrueba, bienvenido al laboratorio"</p>
 */
@RestController
@RequestMapping("/api/v1")
public class HolaControllerEnunciado {

    // TODO: Define el @GetMapping con @PathVariable
    public String saludar(String nombre) {
        return null;
    }
}
