package com.algoritmia.nivel03.servicios;

import java.util.List;

/**
 * 🏆 SOLUCIÓN: Calculadora de Nómina.
 * 
 * <p>Teoría: El uso de la API de Streams para procesar colecciones (como la lista 
 * de deducciones) permite escribir código más limpio y menos propenso a errores 
 * de índice que un bucle 'for' tradicional.</p>
 */
public class CalculadoraNominaSolucion {

    public record Deduccion(String concepto, double monto) {}

    public double calcularNeto(double base, double valorHoraExtra, int cantidadHorasExtra, List<Deduccion> deducciones) {
        double totalExtras = valorHoraExtra * cantidadHorasExtra;
        
        double totalDeducciones = (deducciones == null) ? 0 : 
            deducciones.stream().mapToDouble(Deduccion::monto).sum();

        double neto = base + totalExtras - totalDeducciones;

        if (neto < (base * 0.5)) {
            throw new RuntimeException("Deducciones Excesivas");
        }

        return neto;
    }
}
