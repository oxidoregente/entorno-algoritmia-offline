package com.brandon.nivel2.streams;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import org.junit.jupiter.api.Test;
import com.brandon.nivel2.streams.BuscadorEmpleadosEnunciado.Empleado;

class BuscadorEmpleadosTest {

    @Test
    void testSalarioMaximoIT() {
        BuscadorEmpleadosEnunciado solver = new BuscadorEmpleadosEnunciado();
        List<Empleado> empleados = List.of(
            new Empleado("Alice", "IT", 5000),
            new Empleado("Bob", "HR", 4000),
            new Empleado("Charlie", "IT", 6000),
            new Empleado("David", "IT", 5500)
        );
        
        Double max = solver.encontrarSalarioMaximoIT(empleados);
        
        assertEquals(6000.0, max);
    }
}
