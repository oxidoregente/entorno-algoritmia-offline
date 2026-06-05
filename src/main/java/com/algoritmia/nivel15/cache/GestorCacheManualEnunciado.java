package com.algoritmia.nivel15.cache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

/**
 * 🎓 RETO: Gestión de Caché Manual con RedisTemplate.
 * <b>Dificultad: Media</b>
 * 
 * <p>A veces la anotación @Cacheable no es suficiente y necesitamos 
 * interactuar directamente con Redis para operaciones personalizadas.</p>
 * 
 * <p><b>💡 Tarea:</b> Usa {@link RedisTemplate} para guardar y recuperar 
 * un valor con una clave específica.</p>
 */
@Component
public class GestorCacheManualEnunciado {

    private final RedisTemplate<String, Object> redisTemplate;

    public GestorCacheManualEnunciado(RedisTemplate<String, Object> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    /**
     * Guarda un valor en Redis asociado a una clave.
     *
     * @param clave clave bajo la que se almacenará el valor
     * @param valor objeto a almacenar en caché
     */
    public void guardar(String clave, Object valor) {
        // TODO: Guarda el valor en Redis usando la clave.
    }

    /**
     * Recupera un valor de Redis por su clave.
     *
     * @param clave clave del valor a recuperar
     * @return el objeto almacenado, o null si no existe
     */
    public Object recuperar(String clave) {
        // TODO: Recupera el valor asociado a la clave.
        return null;
    }
}
