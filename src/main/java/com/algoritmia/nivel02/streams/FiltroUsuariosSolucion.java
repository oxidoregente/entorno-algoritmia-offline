package com.algoritmia.nivel02.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * SOLUCIÓN: Filtro de Usuarios con Streams.
 * 
 * <p>Teoría:
 * - .sorted(): Permite ordenar el stream. Podemos usar Comparator.comparing() para mayor claridad.
 * - .map(): Extraemos el campo 'email' de cada objeto Usuario.</p>
 */
public class FiltroUsuariosSolucion {

    public record Usuario(String nombre, int edad, String email) {}

    public List<String> obtenerEmailsUsuariosMayores(List<Usuario> usuarios) {
        return usuarios.stream()
            .filter(u -> u.edad() > 18)
            .sorted(Comparator.comparing(Usuario::nombre))
            .map(Usuario::email)
            .collect(Collectors.toList());
    }
}
