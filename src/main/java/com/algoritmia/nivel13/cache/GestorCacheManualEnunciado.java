package com.algoritmia.nivel13.cache;

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

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    public void guardar(String clave, Object valor) {
        // TODO: Guarda el valor en Redis usando la clave.
    }

    public Object recuperar(String clave) {
        // TODO: Recupera el valor asociado a la clave.
        return null;
    }
}
