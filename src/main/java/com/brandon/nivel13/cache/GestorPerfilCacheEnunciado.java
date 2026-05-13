package com.brandon.nivel13.cache;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import java.time.Duration;

/**
 * 🎓 RETO: Gestor Manual de Caché (Redis).
 * <b>Dificultad: Media</b>
 * 
 * <p>Implementa un servicio que use RedisTemplate para guardar y recuperar 
 * perfiles de usuario de forma manual, estableciendo un tiempo de vida (TTL).</p>
 */
@Service
public class GestorPerfilCacheEnunciado {

    private final RedisTemplate<String, Object> redisTemplate;

    public GestorPerfilCacheEnunciado(RedisTemplate<String, Object> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    public void guardarPerfil(String userId, Object perfil) {
        // TODO: Guarda el perfil en Redis con la clave "user:profile:{userId}" 
        // TODO: Establece un tiempo de expiración de 10 minutos
    }

    public Object obtenerPerfil(String userId) {
        // TODO: Recupera el objeto desde Redis
        return null;
    }
}
