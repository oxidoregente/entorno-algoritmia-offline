package com.algoritmia.nivel02.streams;

import java.util.List;

/**
 * 🎓 RETO: Buscador de Empleados de IT.
 * <b>Dificultad: Fácil</b>
 *
 * <p>Dado un record {@code Empleado(nombre, departamento, salario)},
 * encuentra el salario más alto de los empleados que pertenecen al departamento "IT".</p>
 *
 * <p>Si no hay empleados en IT, devuelve {@code null}.</p>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * empleados = [
 *   { "Ana",   "IT",      4500.0 },
 *   { "Luis",  "Ventas",  3000.0 },
 *   { "Maria", "IT",      5200.0 },
 *   { "Pedro", "RRHH",    2800.0 }
 * ]
 *
 * Resultado: 5200.0  (empleado "Maria" del departamento "IT")
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>Usa {@code stream()} sobre la lista de empleados.</li>
 *   <li>Filtra con {@code filter(e -> "IT".equals(e.departamento()))}.</li>
 *   <li>Encadena {@code mapToDouble(Empleado::salario)} para obtener un {@code DoubleStream}.</li>
 *   <li>Usa {@code .max()} para encontrar el valor más alto.</li>
 *   <li>Si no hay empleados en IT, devuelve {@code null}.</li>
 * </ul>
 */
public class BuscadorEmpleadosEnunciado {

	public record Empleado(String nombre, String departamento, double salario) {
	}

    /**
     * Encuentra el salario más alto entre los empleados del departamento "IT".
     *
     * @param empleados Lista de empleados a evaluar. No debe ser {@code null}.
     * @return El salario máximo del departamento "IT", o {@code null} si no hay ninguno.
     */
    public Double encontrarSalarioMaximoIT(List<Empleado> empleados) {
        // TODO: Implementa tu lógica aquí.
        // Filtra por "IT" y busca el máximo del campo salario.
        return null;
    }
	public Double encontrarSalarioMaximoIT(List<Empleado> empleados) {
		// TODO: Implementa tu lógica aquí.
		// Filtra por "IT" y busca el máximo del campo salario.

		if (empleados.isEmpty()) {
			return 0.0;
		}

		double salarioMaximo = empleados.stream().filter(e -> "IT".equalsIgnoreCase(e.departamento()))
				.mapToDouble(e -> e.salario()).max().orElse(0.0);

		return salarioMaximo;
	}
}
