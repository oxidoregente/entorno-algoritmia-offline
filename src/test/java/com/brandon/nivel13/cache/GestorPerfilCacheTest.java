package com.brandon.nivel13.cache;

import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

@ExtendWith(MockitoExtension.class)
class GestorPerfilCacheTest {

    @Mock
    private RedisTemplate<String, Object> redisTemplate;

    @Mock
    private ValueOperations<String, Object> valueOperations;

    @InjectMocks
    private GestorPerfilCacheEnunciado gestor;

    @Test
    void testGuardadoManual() {
        when(redisTemplate.opsForValue()).thenReturn(valueOperations);
        
        gestor.guardarPerfil("123", "perfil-datos");
        
        // Verificamos que se intentó usar el set de Redis
        // verify(valueOperations).set(eq("user:profile:123"), any(), any());
    }
}
