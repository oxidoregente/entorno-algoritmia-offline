package com.algoritmia.nivel13.cache;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Service;

/**
 * 🎓 RETO: Invalidación de Caché (Cache Eviction).
 * <b>Dificultad: Fácil</b>
 * 
 * <p>Mantener la coherencia de los datos es vital. Cuando un dato cambia, 
 * debemos eliminar la versión antigua de la caché.</p>
 */
@Service
public class CacheInvalidadorEnunciado {

    /**
     * Elimina el perfil del usuario de la caché cuando se actualiza.
     * <b>💡 Pista:</b> Usa @CacheEvict especificando el nombre de la caché 'perfiles'.
     */
    public void actualizarPerfil(String email) {
        // Simulación de actualización en DB
    }
    
    /**
     * Limpia TODA la caché de perfiles.
     * <b>💡 Pista:</b> Usa 'allEntries = true'.
     */
    public void limpiarTodo() {
    }
}
