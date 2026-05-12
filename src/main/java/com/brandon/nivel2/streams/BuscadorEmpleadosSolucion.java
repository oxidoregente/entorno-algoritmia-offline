package com.brandon.nivel2.streams;

import java.util.List;

/**
 * SOLUCIÓN: Buscador de Empleados de IT.
 * 
 * <p>Teoría:
 * Combinamos .filter() para seleccionar el departamento y .mapToDouble() para 
 * extraer los salarios, finalizando con .max() que devuelve un OptionalDouble.</p>
 */
public class BuscadorEmpleadosSolucion {

    public record Empleado(String nombre, String departamento, double salario) {}

    public Double encontrarSalarioMaximoIT(List<Empleado> empleados) {
        return empleados.stream()
                .filter(e -> "IT".equalsIgnoreCase(e.departamento()))
                .mapToDouble(e -> e.salario())
                .max()
                .orElse(0.0);
    }
}
