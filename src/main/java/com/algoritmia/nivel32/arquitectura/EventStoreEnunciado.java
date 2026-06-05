package com.algoritmia.nivel32.arquitectura;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/**
 * 🎓 RETO: Event Store Simple (Fundamento de Event Sourcing).
 * <b>Dificultad: Difícil</b>
 *
 * <p>Event Sourcing es un patrón donde el estado de la aplicación se deriva
 * de una secuencia inmutable de eventos. En lugar de guardar "saldo = 100",
 * guardas "seDepositaron(50)", "seRetiraron(30)", "seDepositaron(80)".
 * El saldo actual se reconstruye aplicando los eventos en orden.</p>
 *
 * <p><b>Conceptos clave:</b></p>
 * <ul>
 *   <li>Eventos: objetos inmutables que representan hechos del pasado.</li>
 *   <li>Event Store: almacenamiento append-only de eventos.</li>
 *   <li>Replay: reconstruir el estado aplicando eventos en orden.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * EventStore store = new EventStore();
 * store.append(new EventoDeposito(100));
 * store.append(new EventoRetiro(30));
 * store.append(new EventoDeposito(50));
 *
 * int saldoActual = store.replay();
 * // 100 - 30 + 50 = 120
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>Usa una {@code LinkedList<Evento>} o {@code ArrayList<Evento>}.</li>
 *   <li>{@code append} añade al final. {@code replay} recorre todos y aplica.</li>
 *   <li>Los eventos deben ser inmutables: usa {@code record} de Java 21.</li>
 * </ul>
 */
public class EventStoreEnunciado {

    /**
     * 🏆 SOLUCIÓN: Almacén append-only de eventos con replay.
     *
     * <p>Event Sourcing en su forma más simple. Cada cambio en el sistema
     * se registra como un evento inmutable. Para conocer el estado actual,
     * se hace "replay" de todos los eventos en orden.</p>
     */
    public static class EventStore {

        private final List<Object> eventos = new LinkedList<>();

        /**
         * Añade un evento al final del store.
         * @param evento El evento a registrar.
         */
        public void append(Object evento) {
            eventos.add(Objects.requireNonNull(evento));
        }

        /**
         * Reconstruye el saldo aplicando los eventos en orden.
         * @return Saldo resultante después de aplicar todos los eventos.
         */
        public int replay() {
            // TODO: Recorre los eventos y aplica cada uno:
            //   - EventoDeposito: suma el monto
            //   - EventoRetiro: resta el monto
            //   - Otros: ignora
            return 0;
        }

        public List<Object> getEventos() {
            return List.copyOf(eventos);
        }
    }

    /** Evento inmutable: se depositó dinero. */
    public record EventoDeposito(int monto) {}

    /** Evento inmutable: se retiró dinero. */
    public record EventoRetiro(int monto) {}

    /**
     * Punto de entrada opcional para probar manualmente.
     */
    public static void main(String[] args) {
        EventStore store = new EventStore();
        store.append(new EventoDeposito(100));
        store.append(new EventoRetiro(30));
        store.append(new EventoDeposito(50));
        System.out.println("Eventos: " + store.getEventos().size());
        System.out.println("Saldo: " + store.replay()); // esperado 120
    }
}
