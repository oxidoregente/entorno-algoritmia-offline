package com.algoritmia.nivel15.cache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * 🏆 SOLUCIÓN: Gestión de Caché Manual con RedisTemplate.
 */
public class GestorCacheManualSolucion {

    private final RedisTemplate<String, Object> redisTemplate;

    public GestorCacheManualSolucion(RedisTemplate<String, Object> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    public void guardar(String clave, Object valor) {
        redisTemplate.opsForValue().set(clave, valor);
    }

    public Object recuperar(String clave) {
        return redisTemplate.opsForValue().get(clave);
    }
}
