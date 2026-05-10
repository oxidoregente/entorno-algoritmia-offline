package com.brandon.nivel3.servicios;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Random;
import org.junit.jupiter.api.Test;

/**
 * Test para MotorCalculoRoguelike.
 * Demuestra cómo testear lógica que usa aleatoriedad inyectando un Random con semilla.
 */
class MotorCalculoRoguelikeTest {

    @Test
    void testDañoNormal() {
        // Arrange: Usamos una semilla que garantice que el primer nextDouble() sea mayor a 0.5
        Random randomFijo = new Random(42); 
        MotorCalculoRoguelike motor = new MotorCalculoRoguelike(randomFijo);

        // Act: 100 base * 1.0 item, 0.1 prob crítico (fallará con semilla 42)
        double resultado = motor.calcularDañoFinal(100.0, 0.1, 1.0);

        // Assert
        assertEquals(100.0, resultado, "El daño debería ser el base sin crítico");
    }

    @Test
    void testDañoCritico() {
        // Arrange: Usamos una semilla que garantice un valor bajo para el crítico
        Random randomFijo = new Random(1); 
        MotorCalculoRoguelike motor = new MotorCalculoRoguelike(randomFijo);

        // Act: 100 base * 1.2 item = 120. Crítico duplicará a 240.
        double resultado = motor.calcularDañoFinal(100.0, 0.9, 1.2);

        // Assert
        assertEquals(240.0, resultado, "El daño debería incluir el bono de ítem y el crítico");
    }
}
