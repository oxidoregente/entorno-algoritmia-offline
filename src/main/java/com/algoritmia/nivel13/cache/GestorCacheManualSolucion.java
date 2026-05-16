package com.algoritmia.nivel13.cache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * 🏆 SOLUCIÓN: Gestión de Caché Manual con RedisTemplate.
 */
public class GestorCacheManualSolucion {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    public void guardar(String clave, Object valor) {
        redisTemplate.opsForValue().set(clave, valor);
    }

    public Object recuperar(String clave) {
        return redisTemplate.opsForValue().get(clave);
    }
}
