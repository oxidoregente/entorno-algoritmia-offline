package com.algoritmia.nivel29.testing;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;

/**
 * 🎓 RETO: Orden de Ejecución de Tests.
 * <b>Dificultad: Fácil</b>
 * 
 * <p>Aunque los tests deben ser independientes, en pruebas de integración 
 * a veces necesitamos un orden específico (ej: 1. Crear, 2. Leer, 3. Borrar).</p>
 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestOrderEnunciado {

    /**
     * <b>💡 Tarea:</b> Usa @Order(1).
     */
    public void primero() {}

    /**
     * <b>💡 Tarea:</b> Usa @Order(2).
     */
    public void segundo() {}
}
