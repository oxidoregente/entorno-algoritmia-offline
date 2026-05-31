package com.algoritmia.nivel02.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 🎓 RETO: Filtro de Usuarios con Streams. <b>Dificultad: Fácil</b>
 *
 * <p>
 * Recibes una lista de objetos `Usuario`. Debes:
 * </p>
 * <ol>
 * <li>Filtrar solo los usuarios mayores de 18 años.</li>
 * <li>Ordenar los resultados alfabéticamente por nombre.</li>
 * <li>Devolver una lista con los emails de esos usuarios.</li>
 * </ol>
 *
 * <h3>Ejemplo:</h3>
 * 
 * <pre>
 * Usuarios: [("Ana", 25, "ana@mail.com"), ("Luis", 17, "luis@mail.com"), ("Bob", 30, "bob@mail.com")]
 * Salida: ["ana@mail.com", "bob@mail.com"]
 * </pre>
 *
 * <p>
 * <b>Pistas:</b>
 * </p>
 * <ul>
 * <li>Usa `filter(u -> u.edad() > 18)`,
 * `sorted(Comparator.comparing(Usuario::nombre))`, y
 * `map(Usuario::email)`.</li>
 * </ul>
 */
public class FiltroUsuariosEnunciado {

	public record Usuario(String nombre, int edad, String email) {
	}

	/**
	 * Obtiene los emails de los usuarios mayores de edad, ordenados alfabéticamente
	 * por nombre.
	 *
	 * @param usuarios Lista de usuarios de entrada.
	 * @return Lista de emails de usuarios mayores de 18 años, ordenados por nombre.
	 */
	public List<String> obtenerEmailsUsuariosMayores(List<Usuario> usuarios) {
		// TODO: Implementa el filtrado, ordenamiento y mapeo con streams
		List<String> lista = usuarios.stream()
					.filter(e -> e.edad > 18)
					.sorted((e1,e2)-> e1.nombre.compareTo(e2.nombre))
					.map(e -> e.email)
					.collect(Collectors.toList());
		
		return lista;
	}
}
