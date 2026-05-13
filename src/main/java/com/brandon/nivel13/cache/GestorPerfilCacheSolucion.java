package com.brandon.nivel13.cache;

import org.springframework.data.redis.core.RedisTemplate;
import java.time.Duration;

/**
 * 🏆 SOLUCIÓN: Gestor Manual de Caché.
 */
public class GestorPerfilCacheSolucion {

    private final RedisTemplate<String, Object> redisTemplate;

    public GestorPerfilCacheSolucion(RedisTemplate<String, Object> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    public void guardarPerfil(String userId, Object perfil) {
        String clave = "user:profile:" + userId;
        redisTemplate.opsForValue().set(clave, perfil, Duration.ofMinutes(10));
    }

    public Object obtenerPerfil(String userId) {
        return redisTemplate.opsForValue().get("user:profile:" + userId);
    }
}
