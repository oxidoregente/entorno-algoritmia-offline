package com.algoritmia.nivel13.cache;

import org.springframework.cache.annotation.CachePut;
import org.springframework.stereotype.Service;

/**
 * 🎓 RETO: Sincronización de Caché (Cache Put).
 * <b>Dificultad: Media</b>
 * 
 * <p>A diferencia de @Cacheable, @CachePut siempre ejecuta el método y 
 * actualiza la caché con el resultado.</p>
 */
@Service
public class CachePutEnunciado {

    /**
     * Actualiza la información del usuario en la caché 'usuarios' 
     * cada vez que este método es llamado.
     * <b>💡 Pista:</b> Usa @CachePut con la clave basada en 'id'.
     */
    public String actualizarNombre(String id, String nuevoNombre) {
        return nuevoNombre;
    }
}
