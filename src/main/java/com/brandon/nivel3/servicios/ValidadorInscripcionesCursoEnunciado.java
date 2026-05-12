package com.brandon.nivel3.servicios;

import org.springframework.stereotype.Service;
import java.util.List;

/**
 * RETO: Validador de Inscripciones a Cursos.
 * 
 * Determina si un estudiante puede inscribirse a un curso avanzado.
 * 
 * Requisitos:
 * 1. El estudiante debe haber aprobado los pre-requisitos necesarios.
 * 2. El estudiante debe tener un promedio (GPA) mínimo de 3.0.
 */
@Service
public class ValidadorInscripcionesCursoEnunciado {

    public record Estudiante(String nombre, double gpa, List<String> cursosAprobados) {}

    public boolean puedeInscribirse(Estudiante estudiante, List<String> requisitos) {
        // TODO: Verifica si estudiante.cursosAprobados contiene TODOS los requisitos
        // TODO: Verifica si gpa >= 3.0
        return false;
    }
}
