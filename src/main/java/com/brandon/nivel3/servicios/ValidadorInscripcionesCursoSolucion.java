package com.brandon.nivel3.servicios;

import java.util.List;

/**
 * SOLUCIÓN: Validador de Inscripciones a Cursos.
 */
public class ValidadorInscripcionesCursoSolucion {

    public record Estudiante(String nombre, double gpa, List<String> cursosAprobados) {}

    public boolean puedeInscribirse(Estudiante estudiante, List<String> requisitos) {
        if (estudiante.gpa() < 3.0) return false;
        
        return estudiante.cursosAprobados().containsAll(requisitos);
    }
}
