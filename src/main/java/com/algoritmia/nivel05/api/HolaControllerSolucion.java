package com.algoritmia.nivel05.api;

import org.springframework.web.bind.annotation.*;

/**
 * 🏆 SOLUCIÓN: Controlador de Saludos.
 */
public class HolaControllerSolucion {

    @GetMapping("/hola/{nombre}")
    public String saludar(@PathVariable String nombre) {
        return "Hola " + nombre + ", bienvenido al laboratorio";
    }
}
