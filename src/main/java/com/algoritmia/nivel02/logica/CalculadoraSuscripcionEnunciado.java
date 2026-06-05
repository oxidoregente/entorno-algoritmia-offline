package com.algoritmia.nivel02.logica;

import org.springframework.stereotype.Service;

/**
 * 🎓 RETO: Calculadora de Suscripción SaaS. <b>Dificultad: Fácil</b>
 *
 * <p>
 * Calcula el costo total de una suscripción según el plan y el periodo
 * seleccionado.
 * </p>
 *
 * <p>
 * <b>Planes y precios mensuales:</b>
 * </p>
 * <ul>
 * <li>BASICO: $10/mes</li>
 * <li>PRO: $20/mes</li>
 * <li>PREMIUM: $50/mes</li>
 * </ul>
 *
 * <p>
 * <b>Reglas de facturación:</b>
 * </p>
 * <ul>
 * <li><b>MENSUAL:</b> Se cobra el precio del plan por 1 mes.</li>
 * <li><b>ANUAL:</b> Se cobra el precio del plan por 12 meses, con un 10% de
 * descuento sobre el total.</li>
 * </ul>
 *
 * <h3>Ejemplos:</h3>
 * 
 * <pre>
 * calcularCosto(PRO, MENSUAL)  -> 20.0
 * calcularCosto(PRO, ANUAL)    -> 20 * 12 * 0.9 = 216.0
 * </pre>
 */
@Service
public class CalculadoraSuscripcionEnunciado {

	public enum Plan {
		BASICO, PRO, PREMIUM
	}

	public enum Periodo {
		MENSUAL, ANUAL
	}

	/**
	 * Calcula el costo total de una suscripción según plan y periodo.
	 *
	 * @param plan    El plan de suscripción (BASICO, PRO, PREMIUM).
	 * @param periodo El periodo de facturación (MENSUAL, ANUAL).
	 * @return El costo total calculado.
	 */
	public double calcularCosto(Plan plan, Periodo periodo) {
		// TODO: Implementa la lógica de facturación SaaS

		double precio = 0;

		System.out.println(plan + " - " + periodo);

		switch (plan) {
		case Plan.BASICO:
			precio = 10;
			break;
		case Plan.PRO:
			precio = 20;
			break;
		case Plan.PREMIUM:
			precio = 50;
			break;
		}

		if (periodo == Periodo.ANUAL) {
			precio *= 12 * 0.9;
		}

		return precio;
	}
}
