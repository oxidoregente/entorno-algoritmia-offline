package com.algoritmia.nivel02.logica;

import org.springframework.stereotype.Service;

import com.jayway.jsonpath.internal.function.numeric.Sum;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 🎓 RETO: Calculadora de Nómina (Salario Neto). <b>Dificultad: Media</b>
 *
 * <p>
 * Calcula el salario neto de un empleado considerando horas extra y
 * deducciones.
 * </p>
 *
 * <p>
 * <b>Fórmula:</b>
 * </p>
 * 
 * <pre>
 * Salario Neto = Salario Base + (Valor Hora Extra * Cantidad Horas Extra) - Suma Deducciones
 * </pre>
 *
 * <p>
 * <b>Regla de Negocio:</b> Si el salario neto resultante es menor al 50% del
 * salario base, debe lanzar una `RuntimeException` con el mensaje "Deducciones
 * Excesivas".
 * </p>
 *
 * <h3>Ejemplo:</h3>
 * 
 * <pre>
 * base=2000, valorHoraExtra=20, cantidadHorasExtra=10, deducciones=[("Salud", 100), ("Pension", 200)]
 * Total extras: 20 * 10 = 200
 * Total deducciones: 300
 * Neto: 2000 + 200 - 300 = 1900
 * Límite 50% base: 1000. Neto (1900) >= 1000, ok.
 * </pre>
 */
@Service
public class CalculadoraNominaEnunciado {

	public record Deduccion(String concepto, double monto) {
	}

	/**
	 * Calcula el salario neto de un empleado.
	 *
	 * @param base               Salario base.
	 * @param valorHoraExtra     Valor de cada hora extra.
	 * @param cantidadHorasExtra Cantidad de horas extras trabajadas.
	 * @param deducciones        Lista de deducciones a aplicar.
	 * @return El salario neto calculado.
	 * @throws RuntimeException Si las deducciones exceden el 50% del salario base.
	 */
	public double calcularNeto(double base, double valorHoraExtra, int cantidadHorasExtra,
			List<Deduccion> deducciones) {
		// TODO: Calcula extras, deducciones y valida la regla del 50%
		double salarioNeto = 0;

		double deduccionesMonto = deducciones.stream().collect(Collectors.summingDouble(Deduccion::monto));
		
		salarioNeto = base + (valorHoraExtra * cantidadHorasExtra) - deduccionesMonto;

		if (salarioNeto < base)
			throw new RuntimeException("Deducciones Excesivas");
		
		return salarioNeto;
	}
}
