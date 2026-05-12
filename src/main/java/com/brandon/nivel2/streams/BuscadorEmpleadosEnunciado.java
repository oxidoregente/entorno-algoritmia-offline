package com.brandon.nivel2.streams;

import java.util.List;
import java.util.OptionalDouble;

/**
 * RETO: Buscador de Empleados de IT.
 * 
 * Dado un record Empleado(String nombre, String departamento, double salario),
 * encuentra el salario más alto de los empleados que pertenecen al departamento "IT".
 * 
 * Si no hay empleados en IT, debe devolver un Optional vacío.
 */
public class BuscadorEmpleadosEnunciado {

    public record Empleado(String nombre, String departamento, double salario) {}

    public Double encontrarSalarioMaximoIT(List<Empleado> empleados) {
        // TODO: Implementa tu lógica aquí.
        // Filtra por "IT" y busca el máximo del campo salario.
        return null;
    }
}
