package com.algoritmia.nivel32.arquitectura;

import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * 🎓 RETO: Repository Pattern (DDD).
 * <b>Dificultad: Media</b>
 *
 * <p>El patrón Repository abstrae la persistencia. El dominio no sabe
 * si los datos viven en memoria, en SQL o en NoSQL: solo conoce una
 * interfaz de "guardar" y "buscar por id". Esto permite cambiar la
 * tecnología de almacenamiento sin tocar la lógica de negocio.</p>
 *
 * <p><b>Conceptos clave:</b></p>
 * <ul>
 *   <li>Repositorio: contrato entre dominio y persistencia.</li>
 *   <li>Aggregate: la entidad que el repositorio persiste.</li>
 *   <li>Aislamiento: el dominio no importa nada de JPA/SQL.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * RepositorioUsuario repo = new RepositorioUsuarioEnMemoria();
 * Usuario ana = new Usuario(UUID.randomUUID(), "Ana", "ana@mail.com");
 * repo.guardar(ana);
 *
 * Usuario encontrado = repo.buscarPorId(ana.getId());
 * // encontrado.getNombre() == "Ana"
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>Usa {@code ConcurrentHashMap<UUID, Usuario>} para thread-safety.</li>
 *   <li>El método {@code guardar} sobreescribe si el id ya existe (upsert).</li>
 *   <li>{@code buscarPorId} retorna {@code Optional<Usuario>}.</li>
 * </ul>
 */
public class RepositoryPatternEnunciado {

    /** Entidad de dominio. Inmutable. */
    public record Usuario(UUID id, String nombre, String email) {
        public Usuario {
            Objects.requireNonNull(id);
            Objects.requireNonNull(nombre);
        }
    }

    /**
     * Contrato del repositorio (lo que el dominio conoce).
     */
    public interface RepositorioUsuario {
        void guardar(Usuario usuario);
        java.util.Optional<Usuario> buscarPorId(UUID id);
        void eliminar(UUID id);
    }

    /**
     * Implementación en memoria del repositorio.
     */
    public static class RepositorioUsuarioEnMemoria implements RepositorioUsuario {

        private final ConcurrentMap<UUID, Usuario> usuarios = new ConcurrentHashMap<>();

        @Override
        public void guardar(Usuario usuario) {
            // TODO: Implementa el upsert
        }

        @Override
        public java.util.Optional<Usuario> buscarPorId(UUID id) {
            // TODO: Implementa la búsqueda
            return java.util.Optional.empty();
        }

        @Override
        public void eliminar(UUID id) {
            // TODO: Implementa la eliminación
        }
    }
}
