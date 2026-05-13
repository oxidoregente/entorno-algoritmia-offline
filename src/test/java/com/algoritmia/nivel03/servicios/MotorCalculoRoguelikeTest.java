package com.algoritmia.nivel03.servicios;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Random;
import org.junit.jupiter.api.Test;

class MotorCalculoRoguelikeTest {

    @Test
    void testDañoNormal() {
        // Semilla 42 garantiza que el primer double sea > 0.1
        Random randomFijo = new Random(42); 
        MotorCalculoRoguelikeEnunciado motor = new MotorCalculoRoguelikeEnunciado(randomFijo);

        double resultado = motor.calcularDañoFinal(100.0, 0.1, 1.0);

        assertEquals(100.0, resultado);
    }

    @Test
    void testDañoCritico() {
        // Semilla 1 garantiza un valor bajo para el crítico
        Random randomFijo = new Random(1); 
        MotorCalculoRoguelikeEnunciado motor = new MotorCalculoRoguelikeEnunciado(randomFijo);

        double resultado = motor.calcularDañoFinal(100.0, 0.9, 1.2);

        assertEquals(240.0, resultado);
    }
}
