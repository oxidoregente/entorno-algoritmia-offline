package com.algoritmia.nivel32.arquitectura;

import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 🎓 RETO: Hexagonal Architecture - Puerto y Adaptador.
 * <b>Dificultad: Difícil</b>
 *
 * <p>La Arquitectura Hexagonal (Ports & Adapters) aísla el dominio del
 * mundo exterior. El dominio define "puertos" (interfaces) y los adaptadores
 * concretos (REST, SQL, etc.) los implementan. Esto invierte la dependencia
 * tradicional: el dominio ya no depende de frameworks.</p>
 *
 * <p><b>Conceptos clave:</b></p>
 * <ul>
 *   <li>Puerto: interfaz que el dominio expone o consume.</li>
 *   <li>Adaptador: implementación concreta (BD, API, CLI, etc.).</li>
 *   <li>Inversión: el dominio no conoce a los adaptadores.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * PuertoNotificaciones puerto = new AdaptadorConsola();
 * ServicioPedidos servicio = new ServicioPedidos(puerto);
 *
 * UUID id = servicio.crearPedido("Laptop", 1500.0);
 * // "Pedido creado y notificado por consola"
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>{@code PuertoNotificaciones} es una interfaz funcional con un solo método.</li>
 *   <li>{@code ServicioPedidos} inyecta el puerto por constructor.</li>
 *   <li>El servicio usa el puerto sin saber qué adaptador hay detrás.</li>
 * </ul>
 */
public class HexagonalArquitecturaEnunciado {

    /**
     * Puerto: lo que el dominio necesita del exterior.
     */
    @FunctionalInterface
    public interface PuertoNotificaciones {
        void enviar(String mensaje);
    }

    /**
     * Servicio de dominio: depende solo del puerto, no del adaptador.
     */
    public static class ServicioPedidos {

        private final PuertoNotificaciones notificaciones;
        private final AtomicInteger contador = new AtomicInteger(0);

        public ServicioPedidos(PuertoNotificaciones notificaciones) {
            this.notificaciones = Objects.requireNonNull(notificaciones);
        }

        /**
         * Crea un pedido y notifica a través del puerto.
         * @param producto Nombre del producto.
         * @param precio   Precio del producto.
         * @return ID del pedido creado.
         */
        public UUID crearPedido(String producto, double precio) {
            // TODO: Implementa: incrementa el contador, genera un UUID,
            // construye un mensaje y llama a notificaciones.enviar()
            return UUID.randomUUID();
        }

        public int totalPedidos() {
            return contador.get();
        }
    }

    /**
     * Adaptador concreto: imprime por consola.
     */
    public static class AdaptadorConsola implements PuertoNotificaciones {
        @Override
        public void enviar(String mensaje) {
            System.out.println("[Notificación] " + mensaje);
        }
    }
}
