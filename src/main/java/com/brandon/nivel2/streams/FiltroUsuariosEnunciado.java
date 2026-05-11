package com.brandon.nivel2.streams;

import java.util.List;

/**
 * RETO: Filtro de Usuarios con Streams.
 * 
 * Recibes una lista de objetos 'Usuario'. Debes:
 * 1. Filtrar solo los usuarios mayores de 18 años.
 * 2. Ordenar los resultados alfabéticamente por nombre.
 * 3. Devolver una lista con los emails de esos usuarios.
 */
public class FiltroUsuariosEnunciado {

    public record Usuario(String nombre, int edad, String email) {}

    public List<String> obtenerEmailsUsuariosMayores(List<Usuario> usuarios) {
        // TODO: Implementa tu lógica aquí
        return null;
    }
}
