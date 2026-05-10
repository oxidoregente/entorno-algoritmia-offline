package com.brandon.nivel2.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Nivel 2: Java Funcional y Streams.
 * 
 * Problema: Calculadora de Recetas (Coffee Blondies).
 * 
 * <p>Este ejercicio demuestra el uso de 'records' de Java 21 para modelos de datos concisos
 * y el procesamiento avanzado con Streams, incluyendo filtrado, transformación 
 * y recolección en mapas.</p>
 */
public class CalculadoraRecetas {

    /**
     * Un record es una clase inmutable diseñada para ser un contenedor de datos simple.
     */
    public record Ingrediente(String nombre, double cantidadGramos) {}

    /**
     * Escala una receta filtrando ingredientes menores a un umbral.
     * 
     * @param ingredientes Lista de ingredientes originales.
     * @param multiplicador Factor de porciones.
     * @return Mapa con el nombre del ingrediente y su cantidad ajustada.
     */
    public Map<String, Double> ajustarReceta(List<Ingrediente> ingredientes, double multiplicador) {
        return ingredientes.stream()
            // 1. Filtrar: Solo ingredientes significativos (> 10g)
            .filter(i -> i.cantidadGramos() >= 10.0)
            // 2. Transformar & Colectar: Mapear a un mapa con la cantidad multiplicada
            .collect(Collectors.toMap(
                Ingrediente::nombre,
                i -> i.cantidadGramos() * multiplicador
            ));
    }
}
