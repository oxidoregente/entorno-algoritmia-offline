package com.algoritmia.nivel03.servicios;

import org.springframework.stereotype.Service;
import java.util.List;

/**
 * 🎓 RETO: Calculadora de Nómina (Salario Neto).
 * <b>Dificultad: Media</b>
 * 
 * <p>Calcula el salario neto de un empleado considerando extras y deducciones.</p>
 * 
 * <p><b>Fórmula:</b>
 * Salario Neto = Salario Base + (Valor Hora Extra * Cantidad Horas Extra) - Suma Deducciones.</p>
 * 
 * <p><b>Regla de Negocio:</b>
 * Si el salario neto resultante es menor al 50% del salario base, debe lanzar una 
 * RuntimeException avisando de "Deducciones Excesivas".</p>
 */
@Service
public class CalculadoraNominaEnunciado {

    public record Deduccion(String concepto, double monto) {}

    public double calcularNeto(double base, double valorHoraExtra, int cantidadHorasExtra, List<Deduccion> deducciones) {
        // TODO: Calcula el total de extras
        // TODO: Calcula la suma de todas las deducciones
        // TODO: Valida la regla del 50% y devuelve el neto
        return 0;
    }
}
