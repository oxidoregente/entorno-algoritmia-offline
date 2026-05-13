package com.algoritmia.nivel03.servicios;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.List;
import org.junit.jupiter.api.Test;
import com.algoritmia.nivel03.servicios.ValidadorInscripcionesCursoEnunciado.Estudiante;

class ValidadorInscripcionesCursoTest {

    @Test
    void testValidacionInscripcion() {
        ValidadorInscripcionesCursoEnunciado validador = new ValidadorInscripcionesCursoEnunciado();
        List<String> requisitos = List.of("Java Basico", "Algoritmos");
        
        Estudiante ok = new Estudiante("UsuarioPrueba", 3.5, List.of("Java Basico", "Algoritmos", "Fisica"));
        Estudiante sinGPA = new Estudiante("Ana", 2.8, List.of("Java Basico", "Algoritmos"));
        Estudiante sinCursos = new Estudiante("Carlos", 4.0, List.of("Java Basico"));

        assertTrue(validador.puedeInscribirse(ok, requisitos));
        assertFalse(validador.puedeInscribirse(sinGPA, requisitos));
        assertFalse(validador.puedeInscribirse(sinCursos, requisitos));
    }
}
