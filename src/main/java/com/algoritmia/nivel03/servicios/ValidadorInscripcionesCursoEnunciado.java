package com.algoritmia.nivel03.servicios;

import org.springframework.stereotype.Service;
import java.util.List;

/**
 * 🎓 RETO: Validador de Inscripciones a Cursos.
 * <b>Dificultad: Fácil</b>
 *
 * <p>Determina si un estudiante puede inscribirse a un curso avanzado.</p>
 *
 * <p>Un estudiante es elegible si cumple con los siguientes requisitos:
 * <ol>
 *   <li>Haber aprobado todos los cursos pre-requisitos necesarios.</li>
 *   <li>Tener un promedio (GPA) mínimo de 3.0.</li>
 * </ol>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * Estudiante: ("Ana", 3.5, ["Matemáticas", "Física"])
 * Requisitos: ["Matemáticas", "Física"]
 * Resultado: true
 * </pre>
 *
 * <p><b>Pistas:</b></p>
 * <ul>
 *   <li>Usa `estudiante.cursosAprobados().containsAll(requisitos)` para verificar los pre-requisitos.</li>
 *   <li>Verifica que `estudiante.gpa() >= 3.0`.</li>
 * </ul>
 */
@Service
public class ValidadorInscripcionesCursoEnunciado {

    public record Estudiante(String nombre, double gpa, List<String> cursosAprobados) {}

    /**
     * Verifica si un estudiante puede inscribirse a un curso según sus requisitos.
     *
     * @param estudiante El estudiante con sus datos.
     * @param requisitos Lista de cursos pre-requisitos necesarios.
     * @return true si cumple todos los requisitos, false en caso contrario.
     */
    public boolean puedeInscribirse(Estudiante estudiante, List<String> requisitos) {
        // TODO: Verifica cursos aprobados y GPA mínimo
        return false;
    }
}
