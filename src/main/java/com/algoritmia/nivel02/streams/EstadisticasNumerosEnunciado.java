package com.algoritmia.nivel02.streams;

import java.util.List;
import java.util.DoubleSummaryStatistics;

/**
 * 🎓 RETO: Estadísticas de Números.
 * <b>Dificultad: Fácil</b>
 *
 * <p>En apps de analítica, monitorización financiera o de sensores IoT es
 * habitual pedir, sobre un conjunto de mediciones, varias métricas a la
 * vez: mínimo, máximo, suma, promedio y conteo. Java ofrece
 * {@code DoubleSummaryStatistics} para obtenerlas en UN SOLO recorrido
 * del stream, evitando múltiples iteraciones.</p>
 *
 * <p><b>Reglas / Estructura:</b></p>
 * <ul>
 *   <li>Recibe un {@code List<Double>} de números.</li>
 *   <li>Devuelve un {@code DoubleSummaryStatistics} con count, sum, min,
 *       max y average calculados en un único pipeline.</li>
 *   <li>Si la lista es vacía el resultado será un {@code DoubleSummaryStatistics}
 *       con count = 0 y resto en {@code 0.0}.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * Entrada:
 *   numeros = [2.0, 5.5, 1.0, 8.0, 3.5]
 * Salida (DoubleSummaryStatistics):
 *   count    = 5
 *   sum      = 20.0
 *   min      = 1.0
 *   max      = 8.0
 *   average  = 4.0
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>Convierte el {@code Stream<Double>} a primitivo con
 *       {@code .mapToDouble(Double::doubleValue)}.</li>
 *   <li>Termina el pipeline con la operación terminal
 *       {@code .summaryStatistics()}.</li>
 *   <li>Desde el objeto resultante puedes leer {@code getMin()}, {@code getMax()},
 *       {@code getAverage()}, {@code getSum()} y {@code getCount()}.</li>
 * </ul>
 */
public class EstadisticasNumerosEnunciado {

    /**
     * Calcula estadísticas descriptivas (count, sum, min, max, average)
     * de la lista de números en una sola pasada de stream.
     *
     * @param numeros lista de valores a analizar; puede estar vacía.
     * @return objeto {@link DoubleSummaryStatistics} con las métricas
     *         agregadas.
     */
    public DoubleSummaryStatistics obtenerEstadisticas(List<Double> numeros) {
        // TODO: Implementa usando .stream().mapToDouble().summaryStatistics()
        return null;
    }
	public DoubleSummaryStatistics obtenerEstadisticas(List<Double> numeros) {
		// TODO: Implementa usando .stream().mapToDouble().summaryStatistics()

		var nums = numeros.stream().mapToDouble(e -> e.doubleValue()).summaryStatistics();

		System.out.println(nums.toString());

		return nums;
	}
}
