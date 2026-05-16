package com.algoritmia.nivel31.reactivo;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;
import java.util.List;

/**
 * 🎓 RETO: Validador de Negocio Reactivo (Project Reactor).
 * <b>Dificultad: Difícil</b>
 * 
 * <p>La programación reactiva permite manejar hilos de forma no bloqueante. 
 * En lugar de esperar a que una DB responda, el hilo se libera para 
 * atender otras peticiones mientras llega la respuesta.</p>
 * 
 * <p><b>💡 Conceptos Clave:</b></p>
 * <ul>
 *   <li><b>Mono:</b> Un flujo que emite 0 o 1 elemento (un objeto).</li>
 *   <li><b>Flux:</b> Un flujo que emite N elementos (una lista).</li>
 *   <li><b>Mono.zip():</b> Combina varios Monos en uno solo. Es ideal para 
 *   ejecutar tareas en paralelo y esperar a que TODAS terminen.</p>
 * </ul>
 * 
 * <p><b>Tarea:</b> Implementa un validador que compruebe un Pedido y un Usuario 
 * al mismo tiempo. Debes unirlos usando Mono.zip y retornar true solo si 
 * ambos validadores aprueban.</p>
 */
@Service
public class ValidadorReactivoEnunciado {
 public Mono<Boolean> validarTodo(Long userId, Long pedidoId) {
        // TODO: Simula Mono<Boolean> para usuario y Mono<Boolean> para pedido
        // TODO: Únelos usando Mono.zip() y devuelve true solo si ambos son true
        return null;
    }
}
