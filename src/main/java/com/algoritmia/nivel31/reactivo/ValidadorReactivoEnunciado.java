package com.algoritmia.nivel31.reactivo;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;
import java.util.List;

/**
 * 🎓 RETO: Validador de Negocio Reactivo.
 * <b>Dificultad: Difícil</b>
 * 
 * <p>Aprende a combinar múltiples flujos asíncronos en uno solo. 
 * El servicio debe validar un Pedido y un Usuario en PARALELO.</p>
 */
@Service
public class ValidadorReactivoEnunciado {

    public Mono<Boolean> validarTodo(Long userId, Long pedidoId) {
        // TODO: Simula Mono<Boolean> para usuario y Mono<Boolean> para pedido
        // TODO: Únelos usando Mono.zip() y devuelve true solo si ambos son true
        return null;
    }
}
