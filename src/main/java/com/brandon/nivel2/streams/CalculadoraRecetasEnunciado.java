package com.brandon.nivel2.streams;

import java.util.List;
import java.util.Map;

/**
 * RETO: Calculadora de Recetas.
 * 
 * Escala una receta filtrando ingredientes irrelevantes.
 * 1. Filtra ingredientes menores a 10 gramos.
 * 2. Multiplica las cantidades restantes por el 'multiplicador'.
 * 3. Devuelve un Mapa con el nombre y la nueva cantidad.
 */
public class CalculadoraRecetasEnunciado {

    public record Ingrediente(String nombre, double cantidadGramos) {}

    public Map<String, Double> ajustarReceta(List<Ingrediente> ingredientes, double multiplicador) {
        // TODO: Implementa tu lógica aquí
        return null;
    }
}
